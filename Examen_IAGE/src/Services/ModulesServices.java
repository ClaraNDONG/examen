package Services;

import java.util.List;

import Entities.Cours;
import Entities.Modules;
import Repository.CoursRepository;
import Repository.ModulesRepository;

public class ModulesServices {
     private ModulesRepository modulesRepository=new ModulesRepository();
    
  public List<Modules> listerModules(){
      return modulesRepository.ListertAll();
   }
   
   
   public void ajouterModules(Modules modules){
    modulesRepository.insert(modules);}
}
