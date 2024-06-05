import java.util.List;
import java.util.Scanner;

import Entities.Cours;
import Entities.Modules;
import Services.CoursServices;
import Services.ModulesServices;
import Services.ProfesseurServices;

public class App {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc=new Scanner(System.in);
        //Dependances
        CoursServices coursServices=new CoursServices();
        ModulesServices modulesServices=new ModulesServices();
        ProfesseurServices professeurServices=new ProfesseurServices();
     
       
        do {
            System.out.println("1-Ajouter un Module");
            System.out.println("2-Lister les modules"); 
            System.out.println("3-Creer un cours"); 
            System.out.println("4-Lister tous les cours");
            System.out.println("5-Lister les cours d'un module et d'un professeur"); 
            System.out.println("6-Quitter");
            
             choix=sc.nextInt();
             sc.nextLine();
            switch (choix) {
                case 1:
                     System.out.println("Entrer le nom du module");
                     String Nom_module=sc.nextLine(); 
                     Modules Md=new Modules();
                      Md.setNomModule(Nom_module);
                      modulesServices.ajouterModules(Md);
                    
                    break;
                
                case 2:
                    List<Modules> modules=  modulesServices.listerModules();
                     for (Modules module: modules) {
                          System.out.println("Nom du module "+ module.getNomModule());
                          System.out.println("=================================");
                     }
                    break;

                case 3:
                     System.out.println("Entrer une date");
                     
                     
                     
                    break;

                case 4:
                    List<Cours>  cours= coursServices.listerCours();
                    for (Cours cl: cours) {
                      System.out.println("date "+ cl.getDates());
                      System.out.println("Heure de debut "+ cl.getHeureD());
                      System.out.println("Heure de fin "+cl.getHeureF() );
                      System.out.println("=================================");
                     }
                   break;
                case 5:
                   ;
               
                break;

            }

        } while (choix!=6);
        
    }
    
}
