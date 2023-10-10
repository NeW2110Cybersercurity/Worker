/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.History;
import model.Worker;
import model.WorkerManager;
import view.Menu;


/**
 *
 * @author Admin
 */
public class WorkerItem extends Menu<String>{
    
    private WorkerManager list= new WorkerManager();
        ArrayList<Worker> lw = new ArrayList<>();
        ArrayList<History> lh = new ArrayList<>();
    public WorkerItem(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                WorkerManager.addWorker(lw);
                break;
            case 2:
                WorkerManager.changeSalary(lw, lh, 1);
                break;
            case 3:
                WorkerManager.changeSalary(lw, lh, 2);
                break;
            case 4: 
                WorkerManager.printListHistory(lh);;
                break;
            case 5:
                System.exit(0);        
        }
    }
}



