package daos;

import beans.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public static void insert(Usuario u) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = DBConnection.prepareStatement("INSERT INTO Usuario(nome,email,telefone,dataNascimento) VALUES (?,?,?,?)");
            ps.setString(1, u.getNome());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getTelefone());
            ps.setString(4, u.getDataDeNascimento());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            rs.next();
            int key = rs.getInt(1);
            u.setId(key);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs == null) {
                    System.out.println("ERROOOOOOO ---");
                }
                ps.close();
                rs.close();
            } catch (SQLException e) {
            }
        }
    }

    public static Usuario find(int id) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = DBConnection.prepareStatement("SELECT * FROM Usuario WHERE idUsuario=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            Usuario usuario = null;
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setDataDeNascimento(rs.getString("dataNascimento"));
            }
            return usuario;

        } finally {
            rs.close();
            ps.close();
        }
    }
}
