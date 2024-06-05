package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entities.Cours;

public class CoursRepository {
    public  List<Cours> selectAll(){
         List<Cours> cours=new ArrayList<>();
       try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_modules"
                    , "root", "");
          //3-Execution et Recuperation
           Statement statement = conn.createStatement();
           ResultSet rs=   statement.executeQuery("SELECT * FROM `cours`");
             while (rs.next()) {
               //Une ligne du ResultSet ==> Une Agence
                 Cours cr=new Cours();
                 cr.setIdC(rs.getInt("IdC"));
                 cr.setDates(rs.getTime("Date"));
                 cr.setHeureD(rs.getTime("HeureD"));
                 cr.setHeureD(rs.getTime("HeureF"));
                 cr.setHeureD(null);
                 cours.add(cr);
             }
             rs.close();
             conn.close();
        } catch (ClassNotFoundException e) {
          System.out.println("Erreur de chargement de Driver");
        }
       catch (SQLException e) {
        System.out.println("Erreur de Connexion a la BD");
      }
        return  cours;
    }

    public  void insert(Cours cours){
        try {
             //1-Chargement du Driver
             Class.forName("com.mysql.cj.jdbc.Driver");
             //2-Se Connecter a une BD
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_modules"
                       , "root", "");
               //3-Execution et Recuperation
                Statement statement = conn.createStatement();
               
                int nbreLigne=statement.executeUpdate("INSERT INTO `cours`(`IdC`, `Date`, `HeureD`, `HeureF`, `module_id`, `prof_id`)");
                conn.close();
           } catch (ClassNotFoundException e) {
               System.out.println("Erreur de chargement de Driver");
           }
          catch (SQLException e) {
             System.out.println("Erreur de Connexion a la BD");
         }
        }
}
