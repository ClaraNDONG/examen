package Services;

import java.util.List;

import Entities.Modules;
import Entities.Professeurs;
import Repository.ModulesRepository;
import Repository.ProfesseurRepository;

public class ProfesseurServices {
    private ProfesseurRepository professeurRepository=new ProfesseurRepository();
    
  public List<Professeurs> listerAgence(){
      return professeurRepository.ListertAll();
   }
   
   
   public void ajouterModules(Professeurs professeurs){
    professeurRepository.insert(professeurs);}
}
