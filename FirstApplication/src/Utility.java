
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Anderson
 * @author Luke Sloan
 */
public class Utility{
    public boolean checkName(JTextField jtf, JButton button){
        if(jtf.getText().length() > 0 && jtf.getText().length() <= 15){
            button.setEnabled(true);
            return true;
        } else{
            button.setEnabled(false);
            return false;
        }
    }

    public boolean checkAge(JTextField jtf, JButton button) throws Exception{
        if(jtf.getText().equals("")){
            button.setEnabled(false);
            return false;
        } else if(Integer.parseInt(jtf.getText()) >= 0 && Integer.parseInt(jtf.getText()) <= 100){
            button.setEnabled(true);
            return true;
        } else{
            button.setEnabled(false);
            throw new Exception("AgeException: 0<= " + jtf.getText() + " <= 100 is invalid.");
        }
        
    }
}
