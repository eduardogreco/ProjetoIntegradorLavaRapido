/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.daos;

import br.edu.utfpr.cwsmanager.model.pessoa.Funcionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import br.edu.utfpr.cwsmanager.model.util.ConnectionFactory;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author RaphaelLira
 */
public class DaoFuncionario implements Dao<Funcionario> {

    private static Funcionario converteRsParaFuncionario(ResultSet rs) throws SQLException {
        Funcionario f = new Funcionario();
        f.setIdFuncionario(rs.getInt("id"));
        f.setNome(rs.getString("nome"));
        f.setCpf(rs.getString("cpf"));
        f.setSexo(rs.getString("sexo"));
        f.setEstadoCivil(rs.getString("Estadocivil"));
        f.setTelPessoal(rs.getString("telPessoal"));
        f.setCelular(rs.getString("celular"));
        f.setEmail(rs.getString("email"));

        return f;
    }

    @Override
    public void persist(Funcionario f) throws Exception {
        if (f.getIdFuncionario() == 0) {
            insert(f);
        } else {
            update(f);
        }
    }

    @Override
    public void delete(Funcionario f) throws Exception {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("DELETE FROM Cliente WHERE id = " + f.getIdFuncionario());
    }

    @Override
    public Funcionario retrieve(int id) throws Exception {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("SELECT * FROM Funcionario WHERE id =" + id);
        ResultSet rs = st.getResultSet();

        rs.next();
        Funcionario f = converteRsParaFuncionario(rs);

        return f;
    }

    @Override
    public List<Funcionario> list() throws Exception {
        List<Funcionario> Funcionario = new ArrayList<Funcionario>();

        Statement st = ConnectionFactory.prepareConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Funcionario");

        while (rs.next()) {
            Funcionario f = converteRsParaFuncionario(rs);
            Funcionario.add(f);
        }

        return Funcionario;
    }

    private void insert(Funcionario f) throws SQLException {
        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Funcionario (nome, cpf, sexo, estadoCivil, telPessoal, celular, email) VALUES(?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, f.getNome());
        pst.setString(2, f.getCpf());
        pst.setString(3, f.getSexo());
        pst.setString(4, f.getEstadoCivil());
        pst.setString(5, f.getTelPessoal());
        pst.setString(6, f.getCelular());
        pst.setString(7, f.getEmail());


        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        f.setIdFuncionario(rs.getInt(1));
    }

    private void update(Funcionario f) throws SQLException {
        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("UPDATE Funcionario SET nome = ?, cpf = ? WHERE id = ?");
        pst.setString(1, f.getNome());
        pst.setString(2, f.getCpf());
        pst.setInt(3, f.getIdFuncionario());
        pst.execute();
    }

//    private Funcionario converteRsParaFuncionario(ResultSet rs) {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
}
