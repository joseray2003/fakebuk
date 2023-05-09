package mongoconexion;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;

public class conexion {
    
    public MongoClient conexion(){
        MongoClient mongo = null;
        try{
            mongo = new MongoClient("localhost", 27017);
        }catch(MongoClientException ex){
            System.out.println("ERROR: " + ex.getMessage());
        }
        return mongo;
    }
    
    public List<Document> listarLibros(){
        MongoClient mongo = conexion();
        MongoDatabase db = mongo.getDatabase("biblioteca");
        MongoCollection<Document> tabla = db.getCollection("libros");
        List<Document> libros = tabla.find().into(new ArrayList<Document>());
        return libros;
        
    }
    
    public boolean Insertar(Document dbo){
        try {
            MongoClient mongo = conexion();
            MongoDatabase db = mongo.getDatabase("biblioteca");
            MongoCollection<Document> tabla = db.getCollection("libros");
            tabla.insertOne(dbo);
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo agregar el nuevo libro");
            return false;
        }
        JOptionPane.showMessageDialog(null, "Nuevo Libro Insertado");
        return true;
    }
    
    public boolean Eliminar(Document dbo){
        try {
            MongoClient mongo = conexion();
            MongoDatabase db = mongo.getDatabase("biblioteca");
            MongoCollection<Document> tabla = db.getCollection("libros");
            tabla.deleteOne(dbo);
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el libro");
            return false;
        }
        JOptionPane.showMessageDialog(null, "Libro Eliminado");
        return true;
    }
    
    public boolean Editar(Document original, Document nuevo){
        try {
            MongoClient mongo = conexion();
            MongoDatabase db = mongo.getDatabase("biblioteca");
            MongoCollection<Document> tabla = db.getCollection("libros");
            tabla.replaceOne(original, nuevo);
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo editar el libro");
            return false;
        }
        JOptionPane.showMessageDialog(null, "Libro Editado");
        return true;
    }
    
    //      BASE DE DATOS DE USUARIO
    
    public List<Document> listarFiltro(Document dbo){
        MongoClient mongo = conexion();
        MongoDatabase db = mongo.getDatabase("fakebook");
        MongoCollection<Document> collec = db.getCollection("usuario");
        List<Document> usuario = collec.find(dbo).into(new ArrayList<Document>());
        return usuario;
    }
    
    public boolean Login(String email, String password){
        try{
            MongoClient mongo = conexion();
            MongoDatabase db = mongo.getDatabase("fakebook");
            MongoCollection<Document> collec = db.getCollection("usuario");
            Document query = new Document("email", email).append("password", password);
            collec.find(query).first();
        }catch(Exception ex){
            System.out.println("ERROR: " + ex.getMessage());
            return false;
        }
        return true;
    }
    
}
