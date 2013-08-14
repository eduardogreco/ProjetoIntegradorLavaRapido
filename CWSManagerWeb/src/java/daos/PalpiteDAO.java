package daos;

import beans.Palpite;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PalpiteDAO {

    public static void insert(Palpite p) {
        PreparedStatement ps = null;
        try {
            ps = DBConnection.prepareStatement("INSERT INTO Palpite(campeao,vice,palpiteiro) VALUES (?,?,?)");
            ps.setString(1, p.getCampeao());
            ps.setString(2, p.getVice());
            ps.setInt(3, p.getId_usuario());
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

    public List<Palpite> listarTodosPalpites() {
        List<Palpite> palpites = new ArrayList<Palpite>();
        PreparedStatement ps = null;
        try {
            ps = DBConnection.prepareStatement("SELECT * FROM Palpite");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Palpite p = new Palpite();
                String campeao = rs.getString("campeao");
                String vice = rs.getString("vice");
                int id_usuario = rs.getInt("palpiteiro");
                
                p.setCampeao(campeao);
                p.setVice(vice);
                p.setId_usuario(id_usuario);
                palpites.add(p);
            }
            rs.close();

        } catch (Exception e) {
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
            }
        }
        return palpites;
    }

    public List<Palpite> listarTodosPalpitesPorSelecao(String selecao) {
        List<Palpite> palpites = new ArrayList<Palpite>();
        PreparedStatement ps = null;
        try {
            ps = DBConnection.prepareStatement("Select * from Palpite where campeao=?");
            ps.setString(1, "Brasil");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Palpite p = new Palpite();
                String campeao = rs.getString("campeao");
                String vice = rs.getString("vice");
                int id_usuario = rs.getInt("palpiteiro");
                p.setCampeao(campeao);
                p.setVice(vice);
                p.setId_usuario(id_usuario);
                palpites.add(p);
            }
            rs.close();

        } catch (Exception e) {
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
            }
        }
        return palpites;
    }
}
