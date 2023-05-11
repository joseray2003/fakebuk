package control;

import java.util.List;
import mongoconexion.conexion;
import org.bson.Document;

public class usuarioController {

    conexion mongoDB = new conexion();
    
    public List<Document> listarLibros(){
        return mongoDB.listarLibros();
    }
    
    public boolean Insertar(Document dbo){
        return mongoDB.Insertar(dbo);
    }
    
    public boolean Eliminar(Document dbo){
        return mongoDB.Eliminar(dbo);
    }
    
    public boolean Editar(Document original, Document nuevo){
        return mongoDB.Editar(original, nuevo);
    }
    
    public boolean Login(String email, String password){
        return mongoDB.Login(email, password);
    }
    
    public List<Document> ListarFiltro(Document dbo){
        return mongoDB.listarFiltro(dbo);
    }
    
    public List<Document> ListarUsuarios(Document dbo){
        return mongoDB.listarUsuarios();
    }
    
    
}
