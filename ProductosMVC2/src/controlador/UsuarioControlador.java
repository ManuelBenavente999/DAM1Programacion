/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import modelo.*;
import java.util.List;
import java.sql.*;
import vista.*;


/**
 *
 * @author manuel.benavente
 */
public class UsuarioControlador {
    private UsuariosVista vista;    
    private UsuarioDAO dao;

        public UsuarioControlador(UsuariosVista vista) throws SQLException {
            this.vista = vista;
            this.dao = new UsuarioDAO();
            init();
        }
    
        private void init() {
            vista.getBtnAgregar().addActionListener(e -> agregar());
            vista.getBtnEditar().addActionListener(e -> editar());
            vista.getBtnEliminar().addActionListener(e -> eliminar());
            listar();
        }
        
        private void agregar() {
        try {
            String nombre = vista.getTxtNombre().getText();
            String email = vista.getTxtEmail().getText();
            Usuario u = new Usuario(0, nombre, email);
            dao.agregar(u);
            listar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
        
        private void editar() {
            try {
                int id = Integer.parseInt(vista.getTxtId().getText());
                String nombre = vista.getTxtNombre().getText();
                String email = vista.getTxtEmail().getText();
                Usuario u = new Usuario(id, nombre, email);
                dao.actualizar(u);
                listar();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    private void eliminar() {
        try {
            int id = Integer.parseInt(vista.getTxtId().getText());
            dao.eliminar(id);
            listar();   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void listar() {
        try {
            List<Usuario> lista = dao.listar();
            vista.mostrarUsuarios(lista);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

