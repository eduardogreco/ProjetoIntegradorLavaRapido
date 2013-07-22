/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.daos;

import br.edu.utfpr.cwsmanager.model.util.ConnectionFactory;
import br.edu.utfpr.cwsmanager.model.veiculo.Veiculo;
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
public class DaoVeiculo implements Dao<Veiculo> {

    public static Veiculo converteRsParaVeiculo(ResultSet rs) throws SQLException {
        Veiculo v = new Veiculo();
        v.setId(rs.getInt("id"));
        v.setPlaca(rs.getString("placa"));
        v.setModelo(rs.getString("modelo"));
        v.setCor(rs.getString("cor"));
        v.setTipoVeiculo(rs.getString("tipoVeiculo"));

        return v;
    }

    @Override
    public void persist(Veiculo v) throws Exception {
        if (v.getId() == 0) {
            insert(v);
        } else {
            update(v);
        }
    }

    @Override
    public void delete(Veiculo v) throws Exception {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("DELETE FROM Veiculo WHERE id = " + v.getId());
    }
    
    @Override
    public Veiculo retrieve(int id) throws Exception {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("SELECT * FROM Veiculo WHERE id =" + id);
        ResultSet rs = st.getResultSet();

        rs.next();
        Veiculo v = converteRsParaVeiculo(rs);

        return v;
    }

    @Override
    public List<Veiculo> list() throws Exception {
        List<Veiculo> Veiculos = new ArrayList<Veiculo>();
        
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Veiculo");

        while (rs.next()) {
            Veiculo v = converteRsParaVeiculo(rs);
            Veiculos.add(v);
        }

        return Veiculos;
    }

    public List<Veiculo> list(int idCliente) throws Exception {
        List<Veiculo> Veiculos = new ArrayList<Veiculo>();
        
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Veiculo WHERE idCliente = " + idCliente);

        while (rs.next()) {
            Veiculo v = converteRsParaVeiculo(rs);
            Veiculos.add(v);
        }
        return Veiculos;
    }
    
    
    public void insert(Veiculo v) throws SQLException {
        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Veiculo (idCliente, placa, modelo, cor, tipoVeiculo) VALUES(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setInt(1, v.getCliente().getId());
        pst.setString(2, v.getPlaca());
        pst.setString(3, v.getModelo());
        pst.setString(4, v.getCor());
        pst.setString(5, v.getTipoVeiculo());


        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        v.setId(rs.getInt(1));
    }

    public void update(Veiculo v) throws SQLException {
        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("UPDATE Veiculo SET placa = ?, modelo = ?, cor = ?, tipoVeiculo = ? WHERE id = ?");
        pst.setString(1, v.getPlaca());
        pst.setString(2, v.getModelo());
        pst.setString(3, v.getCor());
        pst.setString(4, v.getTipoVeiculo());
        pst.setInt(5, v.getId());
        pst.execute();
    }
}
