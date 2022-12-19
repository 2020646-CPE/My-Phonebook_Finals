/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package phonebook;


/**
 *
 * @author user
 */
public class Phonebook implements CRUD_Interface {

    public static void main(String[] args) {
        //Initialize Data Structure
        CRUD_Interface.DB_Initialize();
        //Insert Sample Data
        System.out.println("Adding Sample Data");
        CRUD_Interface.addRow("Nida", "Simbahan", "22/03/1967", "Tanauan City", "bienvenidasimbahan@gmail.com", "09254695715");
        CRUD_Interface.addRow("Angelo", "Dela Rosa", "21/06/2002", "Tanauan City", "angelodelarosa123@gmail.com", "09215958668");
        CRUD_Interface.addRow("Shairmain", "Simbahan", "23/04/2002", "Tanauan City", "2020646@ub.edu.ph", "09368546707");
        //Initialize GUI
        MainF app = new MainF();
        app.setVisible(true);
        System.out.println("Hello World!");
        
        
    }
}
