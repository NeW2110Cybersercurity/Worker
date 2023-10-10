/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import controller.WorkerItem;
import java.util.ArrayList;
import model.Worker;
import view.Menu;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> ld = new ArrayList<>();
        String title = "Doctor Management ";
        String[] s = new String[]{"Add worker. ", "Increase salary for worker.",
            " Decrease for worker. ", "Show adjusted salary worker information ", "Exit"};
        Menu<String> menu = new WorkerItem(title, s);
        menu.run();
    }
}

