package conectar;

import modelo.Persona;
import modelo.PersonaModelo;
import java.sql.SQLException;
import java.util.ArrayList;

public class Ejecutar {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // Conectar a la base de datos
        Conectar conectar = new Conectar();
        conectar.conectar();
        
        
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre("Juan");
        nuevaPersona.setApellido("Pérez");
        nuevaPersona.setEdad(30);
        PersonaModelo.insert(nuevaPersona);

        // Obtener todas las personas
        ArrayList<Persona> personas = PersonaModelo.getTodos();
        for (Persona p : personas) {
            System.out.println(p.getId() + " - " + p.getNombre() + " - " + p.getApellido() + " - " + p.getEdad());
        }
    }
}