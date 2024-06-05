package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entities.Modules;
import Entities.Professeurs;

public class ProfesseurRepository {
    public  List<Professeurs> ListertAll(){
         List<Professeurs> professeurs=new ArrayList<>();
       try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_modules"
                    , "root", "");
          //3-Execution et Recuperation
           Statement statement = conn.createStatement();
           ResultSet rs=   statement.executeQuery("SELECT * FROM `professeurs`");
             while (rs.next()) {
               //Une ligne du ResultSet ==> Une Agence
                 Professeurs pr=new Professeurs();
                 pr.setNomP(rs.getString("NomP"));
                 pr.setPrenomP(rs.getString("PrenomP"));
                 pr.setTell(rs.getString("Tell"));
                 
                 professeurs.add(pr);
             }
             rs.close();
             conn.close();
        } catch (ClassNotFoundException e) {
          System.out.println("Erreur de chargement de Driver");
        }
       catch (SQLException e) {
        System.out.println("Erreur de Connexion a la BD");
      }
        return  professeurs;
    }

    public  void insert(Professeurs professeurs){
        try {
             //1-Chargement du Driver
             Class.forName("com.mysql.cj.jdbc.Driver");
             //2-Se Connecter a une BD
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_modules"
                       , "root", "");
               //3-Execution et Recuperation
                Statement statement = conn.createStatement();
               
                int nbreLigne=statement.executeUpdate("INSERT INTO `professeurs`(`IdP`, `NomP`, `PrenomP`, `Tell`)");
                conn.close();
           } catch (ClassNotFoundException e) {
               System.out.println("Erreur de chargement de Driver");
           }
          catch (SQLException e) {
             System.out.println("Erreur de Connexion a la BD");
         }
        }
}
