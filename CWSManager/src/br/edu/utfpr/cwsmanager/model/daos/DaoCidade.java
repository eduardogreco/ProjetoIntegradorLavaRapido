/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.daos;

import br.edu.utfpr.cwsmanager.model.endereco.Cidade;
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
public class DaoCidade implements Dao<Cidade> {
    public static Cidade converteRsParaCidade(ResultSet rs) throws SQLException {
        Cidade c = new Cidade();
        c.setId(rs.getInt("id"));
        c.setNome(rs.getString("nome"));
        c.setEstado(rs.getString("estado"));
        return c;
    }

    @Override
    public void persist(Cidade c) throws Exception {
         if (c.getId() == 0) {
            insert(c);
        } else {
            update(c);
        }
    }

    @Override
    public void delete(Cidade c) throws Exception {
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("DELETE FROM Cidade WHERE id = " + c.getId());
    }

    @Override
    public Cidade retrieve(int id) throws Exception {
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        st.execute("SELECT * FROM Cidade WHERE id =" + id);
        ResultSet rs = st.getResultSet();
        
        rs.next();
        Cidade c = converteRsParaCidade(rs);
       
        return c;
    }

    @Override
    public List<Cidade> list() throws Exception {
        List<Cidade> Cidades = new ArrayList<Cidade>();
        
        Statement st =  ConnectionFactory.prepareConnection().createStatement();                                
        ResultSet rs =  st.executeQuery("SELECT * FROM Cidade");
        
        while(rs.next()){
            Cidade c = converteRsParaCidade(rs);
            Cidades.add(c);
        }
        
        return Cidades;
    }

    public void insert(Cidade c) throws SQLException {
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Cidade (nome, estado) VALUES(?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, c.getNome());
        pst.setString(2, c.getEstado());
        
        pst.execute();
        
        ResultSet rs = pst.getGeneratedKeys();
        rs.next();
        c.setId(rs.getInt(1));
        
    }

    public void update(Cidade c) throws SQLException {
        PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement("UPDATE Cidade SET nome = ?, estado = ? WHERE id = ?");
        pst.setString(1, c.getNome());
        pst.setString(2, c.getEstado());
        pst.setInt(3, c.getId());
        pst.execute();
    }
    
    public List<Cidade> list(Filter... filters) throws SQLException{
        
        List<Cidade> Cidades = new ArrayList<Cidade>();
        
        ResultSet rs = null;
        
        /* Verifica se algum friltro foi fornecido para o método */
        if(filters == null || filters.length == 0){
            Statement st =  ConnectionFactory.prepareConnection().createStatement();
            rs =  st.executeQuery("SELECT * FROM Cidade");
        }else{
            String sql = "SELECT * FROM Cidade WHERE ";
            
            for(Filter f : filters){
                System.out.println(f);
                switch(f.getOperator()){
                    case IS_NULL: sql += f.getAttribute() + " IS NULL"; break;
                    case LIKE: sql += f.getAttribute() + " LIKE '%" + f.getValue()+ "%'"; break;
                    case EQUAL: sql += f.getAttribute() + "='" + f.getValue()+ "'"; break;
                    default:
                        throw new RuntimeException("Tipo de operador não suportado:" + f.getOperator());
                }
            }
            PreparedStatement pst =  ConnectionFactory.prepareConnection().prepareStatement(sql);
            System.out.println("SQL:" + sql);
            rs =  pst.executeQuery();
        }
        
        /* Converte o ResultSet da query para uma lista de objetos */
        while(rs.next()){
            Cidade c = converteRsParaCidade(rs);
            Cidades.add(c);
        }
        
        return Cidades;
    }
}
