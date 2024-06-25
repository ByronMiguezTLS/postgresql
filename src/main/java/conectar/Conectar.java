package conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {

    public Connection conectar() throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://127.0.0.1:5432/Usuarios";
        String usuario = "postgres";
        String clave = "ByrMig01";
        Class.forName("org.postgresql.Driver");
        Connection cn = DriverManager.getConnection(url, usuario, clave);

        if (cn != null) {
            System.out.println("Conectado a la bbdd");
        } else {
            System.out.println("Error al conectar a la bbdd");
        }
        return cn;
    }
}
