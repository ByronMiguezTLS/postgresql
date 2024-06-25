package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import conectar.Conectar;

public class PersonaModelo {

    private static Connection obtenerConexion() throws SQLException, ClassNotFoundException {
        Conectar conectar = new Conectar();
        return conectar.conectar();
    }

    public static ArrayList<Persona> getTodos() {
        ArrayList<Persona> personas = new ArrayList<>();

        try (Connection cn = obtenerConexion()) {
            String query = "SELECT * FROM persona";
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Persona p = new Persona();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setEdad(rs.getInt("edad"));
                personas.add(p);
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return personas;
    }

    public static void insert(Persona persona) {
        String sql = "INSERT INTO persona(nombre, apellido, edad) VALUES(?,?,?)";

        try (Connection cn = obtenerConexion()) {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, persona.getNombre());
            pst.setString(2, persona.getApellido());
            pst.setInt(3, persona.getEdad());
            pst.execute();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
