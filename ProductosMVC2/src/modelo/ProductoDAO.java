/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;


import java.sql.*;
import java.util.*;

/**
 *
 * @author manuel.benavente
 */
public class ProductoDAO {
    private Connection conn;
    
    public ProductoDAO() throws SQLException {
        conn = Conexion.getConnection();
    }
    
    // Crear producto
    public void agregar(Producto p) throws SQLException {
        String sql ="INSERT INTO producto(nombre, precio) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecio());
            ps.executeUpdate();
        }
    
        //Actualizar producto
    public void actualizar(Producto p) throws SQLException {
        String sql = "UPDATE producto SET nombre=?, precio=? WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecio());
            ps.setInt(3, p.getId());
            ps.executeUpdate();
    }
    
        public void eliminar(int id) throws SQLException {
        String sql = "DELETE FROM producto WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
    
    
    // Obtener todos los productos
    public List<Producto> listar() throws SQLException {
        List<Producto> lista = new ArrayList<>();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM producto");
            while (rs.next()) {
            Producto p = new Producto();
            p.setId(rs.getInt("id"));
            p.setNombre(rs.getString("nombre"));
            p.setPrecio(rs.getDouble("precio"));
            }
        return lista;
    }
}