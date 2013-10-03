/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import beans.Agendar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardogreco
 */
public class AgendarDAO {
     public static void insert(Agendar a) {
        PreparedStatement ps = null;
        try {
            ps = DBConnection.prepareStatement("INSERT INTO agendamento(nome,email,veiculo,tipoServico,dataagenda,hora) VALUES (?,?,?,?,?,?)");
            ps.setString(1, a.getNome());
            ps.setString(2, a.getEmail());
            ps.setString(3, a.getVeiculo());
            ps.setString(4, a.getTipoServico());
            ps.setString(5, a.getDataagenda());
            ps.setString(6, a.getHora());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
            }
        }
    }

    public List<Agendar> listarTodosPalpites() {
        List<Agendar> agendamentos = new ArrayList<Agendar>();
        PreparedStatement ps = null;
        try {
            ps = DBConnection.prepareStatement("SELECT * FROM agendamento");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Agendar a = new Agendar();
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String veiculo = rs.getString("veiculo");
                String tipoServico = rs.getString("tipoServico");
                String dataagenda = rs.getString("dataagenda");
                String hora = rs.getString("hora");
                
                a.setNome(nome);
                a.setEmail(email);
                a.setVeiculo(veiculo);
                a.setTipoServico(tipoServico);
                a.setDataagenda(dataagenda);
                a.setHora(hora);
                agendamentos.add(a);
            }
            rs.close();

        } catch (Exception e) {
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
            }
        }
        return agendamentos;
    }
}
