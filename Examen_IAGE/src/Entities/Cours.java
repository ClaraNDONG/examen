package Entities;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import Entities.Modules;
import Entities.Professeurs;
import javax.xml.crypto.Data;

public class Cours {
    private int idC;
    private LocalDate dates;
    
    private Time heureD;

    private LocalTime heureF;

    private Modules modules;
    //ManytoOne
    public Modules getModules() {
        return modules;
    }
    public void set(Modules modules) {
        this.modules = modules;
    }

    private Professeurs professeurs;

    public Professeurs getProfesseurs() {
        return professeurs;
    }
    public void setProfesseurs(Professeurs professeurs) {
        this.professeurs = professeurs;
    }
    //OnetoMany
    
    public int getIdC() {
        return idC;
    }
    public void setIdC(int idC) {
        this.idC = idC;
    }

    public LocalDate getDates() {
        return dates;
    }
    public void setDates(LocalDate dates) {
        this.dates = dates;
    }
    
    public Time getHeureD() {
        return heureD;
    }
    public void setHeureD(Time time) {
        this.heureD = time;
    }

    public LocalTime getHeureF() {
        return heureF;
    }
    public void setHeureF(LocalTime heureF) {
        this.heureF = heureF;
    }
    public void setDates(Time time) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDates'");
    }
    
}

