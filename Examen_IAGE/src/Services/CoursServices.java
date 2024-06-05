package Services;

import java.util.List;

import Entities.Cours;
import Repository.CoursRepository;

public class CoursServices {
    private CoursRepository coursRepository=new CoursRepository();
    
  public List<Cours> listerCours(){
      return coursRepository.selectAll();
   }
   
   
   public void ajouterCours(Cours cours){
    coursRepository.insert(cours);}
}
