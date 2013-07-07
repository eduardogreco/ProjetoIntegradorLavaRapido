/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.daos;

import br.edu.utfpr.cwsmanager.model.endereco.Endereco;
import br.edu.utfpr.cwsmanager.model.util.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EduardoGreco
 */
public class DaoEndereco implements Dao<Endereco> {
    
    private DaoCidade daoCidade = new DaoCidade();

    
    public Endereco converteRsParaEndereco(ResultSet rs) throws SQLException, Exception {
        Endereco e = new Endereco();
        e.setId(rs.getInt("id"));
        e.setNomeEndereco(rs.getString("nomeendereco"));
        e.setNumero(rs.getInt("numero"));
        e.setComplemento(rs.getString("complemento"));
        e.setBairro(rs.getString("bairro"));
        e.setCidade(daoCidade.retrieve(rs.getInt("id_cidade")));
        e.setCep(rs.getString("cep"));
        return e;
    }
    @Override
    public void persist(Endereco e) throws Exception {
        if (e.getId() == 0) {
            insert(e);
        } else {
            update(e);
        }
    }

    @Override
    public void delete(Endereco e) throws Exception {
Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("DELETE FROM Endereco WHERE id = " + e.getId());
    }
    
     public void deleteid_cliente(Endereco e) throws Exception {
Statement st = ConnectionFactory.prepareConnection().createStatement();
            st.execute("DELETE FROM Endereco WHERE id_cliente = " + e.getCliente().getId());
    }

    @Override
    public Endereco retrieve(int id) throws Exception {
 Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("SELECT * FROM Endereco WHERE id =" + id);
        ResultSet rs = st.getResultSet();

        rs.next();
        Endereco e = converteRsParaEndereco(rs);
        return e;
    }

    public Endereco retrieveid_cliente(int id) throws Exception {
 Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("SELECT * FROM Endereco WHERE id_cliente =" + id);
        ResultSet rs = st.getResultSet();

        rs.next();
        Endereco e = converteRsParaEndereco(rs);
        return e;
    }
    
    @Override
    public List<Endereco> list() throws Exception {
List<Endereco> Enderecos = new ArrayList<Endereco>();
        
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM Pessoa");
        
        while(rs.next()){
            Endereco e = converteRsParaEndereco(rs);
            Enderecos.add(e);
        }
        
        return Enderecos;
    }

    public void insert(Endereco e) throws SQLException {
 PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Endereco (id_cliente, nomeEndereco, numero, complemento, bairro, id_cidade, cep) VALUES(?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
 pst.setInt(1, e.getCliente().getId());
 pst.setString(2, e.getNomeEndereco());
        pst.setInt(3, e.getNumero());
        pst.setString(4, e.getComplemento());
        pst.setString(5, e.getBairro());
        pst.setInt(6, e.getCidade().getId());
        pst.setString(7, e.getCep());



        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        e.setId(rs.getInt(1));
    }

    public void update(Endereco e) throws SQLException {
PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("UPDATE Endereco SET nomeEndereco = ?, numero = ?, complemento = ?, bairro = ?, id_cidade = ?, cep = ? WHERE id = ?");
         pst.setString(1, e.getNomeEndereco());
        pst.setInt(2, e.getNumero());
        pst.setString(3, e.getComplemento());
        pst.setString(4, e.getBairro());
        pst.setInt(5, e.getCidade().getId());
        pst.setString(6, e.getCep());
        pst.setInt(7, e.getId());
        pst.execute();

    }
    
     public void updateid_cliente(Endereco e) throws SQLException {
PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("UPDATE Endereco SET nomeEndereco = ?, numero = ?, complemento = ?, bairro = ?, id_cidade = ?, cep = ? WHERE id_cliente = ?");
         pst.setString(1, e.getNomeEndereco());
        pst.setInt(2, e.getNumero());
        pst.setString(3, e.getComplemento());
        pst.setString(4, e.getBairro());
        pst.setInt(5, e.getCidade().getId());
        pst.setString(6, e.getCep());
        pst.setInt(7, e.getCliente().getId());
        pst.execute();

    }

    
}
