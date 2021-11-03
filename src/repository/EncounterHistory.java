/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import model.Encounter;

/**
 *
 * @author kpsingh
 */
public class EncounterHistory {
    ArrayList<Encounter> encounterHistory;
    
    public EncounterHistory() {
        
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory.addAll(encounterHistory);
    }
    
    public void addEncounterToHistory(Encounter enc){
        this.encounterHistory.add(enc);
    }
    
}
