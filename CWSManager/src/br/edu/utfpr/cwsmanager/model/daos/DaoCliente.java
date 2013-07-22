/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.daos;

import br.edu.utfpr.cwsmanager.model.pessoa.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import br.edu.utfpr.cwsmanager.model.util.ConnectionFactory;
import br.edu.utfpr.cwsmanager.model.veiculo.Veiculo;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author EduardoGreco
 */
public class DaoCliente implements Dao<Cliente> {

    private DaoVeiculo daoVeiculo = new DaoVeiculo();
    private DaoEndereco daoEndereco = new DaoEndereco();
    
    public static Cliente converteRsParaCliente(ResultSet rs) throws SQLException {
        Cliente c = new Cliente();
        c.setId(rs.getInt("id"));
        c.setNome(rs.getString("nome"));
        c.setCpf(rs.getString("cpf"));
        c.setSexo(rs.getString("sexo"));
        c.setDataNascimento(rs.getDate("dataNascimento"));
        c.setTelPessoal(rs.getString("telPessoal"));
        c.setCelular(rs.getString("celular"));
        c.setTelComercial(rs.getString("telComercial"));
        c.setEmail(rs.getString("email"));
        c.setLogin(rs.getString("login"));
        c.setSenha(rs.getString("senha"));
        c.getEndereco().setId((rs.getInt("idEndereco")));
        return c;
    }

    @Override
    public void persist(Cliente c) throws Exception {
        if (c.getId() == 0) {
            insert(c);
        } else {
            update(c);
        }
    }

    @Override
    public void delete(Cliente c) throws Exception {
        for(Veiculo v: c.getVeiculos()){
            daoVeiculo.delete(v);            
        }      
 
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("DELETE FROM Cliente WHERE id = " + c.getId());

        daoEndereco.delete(c.getEndereco());       
    }

    @Override
    public Cliente retrieve(int id) throws Exception {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("SELECT * FROM Cliente WHERE id =" + id);
        ResultSet rs = st.getResultSet();

        rs.next();
        Cliente c = converteRsParaCliente(rs);

        c.setVeiculos(daoVeiculo.list(c.getId()));
        c.setEndereco(daoEndereco.retrieve(c.getEndereco().getId()));
        return c;
    }

    @Override
    public List<Cliente> list() throws Exception {
        List<Cliente> Clientes = new ArrayList<Cliente>();

        Statement st = ConnectionFactory.prepareConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Cliente");

        while (rs.next()) {
            Cliente p = converteRsParaCliente(rs);
            Clientes.add(p);
        }

        return Clientes;
    }

    public Integer insert(Cliente c) throws SQLException {
        
        daoEndereco.insert(c.getEndereco());
        
        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Cliente (nome, cpf, sexo, dataNascimento, telPessoal, celular, telComercial, email, login, senha, idEndereco) VALUES(?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, c.getNome());
        pst.setString(2, c.getCpf());
        pst.setString(3, c.getSexo());
        pst.setDate(4, new Date(c.getDataNascimento().getTime()));
        pst.setString(5, c.getTelPessoal());
        pst.setString(6, c.getCelular());
        pst.setString(7, c.getTelComercial());
        pst.setString(8, c.getEmail());
        pst.setString(9, c.getLogin());
        pst.setString(10, c.getSenha());
        pst.setInt(11, c.getEndereco().getId());


        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        c.setId(rs.getInt(1));
        
        for (Veiculo obj : c.getVeiculos()){
            obj.setCliente(c);
            daoVeiculo.insert(obj);
        }
        
        return c.getId();
    }

    public void update(Cliente c) throws SQLException, Exception {
        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("UPDATE Cliente SET nome = ?, cpf = ? WHERE id = ?");
        pst.setString(1, c.getNome());
        pst.setString(2, c.getCpf());
        pst.setInt(3, c.getId());
        pst.execute();
        
        daoEndereco.update(c.getEndereco());
        
        for (Veiculo obj : c.getVeiculos()){
            obj.setCliente(c);
            daoVeiculo.persist(obj);
        }
    }
}
