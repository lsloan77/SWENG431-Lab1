
import javax.swing.JButton;
import javax.swing.JTextField;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author Alex Anderson
 * @author Luke Sloan
 */
public class Utility{
    public boolean checkName(JTextField jtf, JButton button) throws Exception{
        if(jtf.getText().length() > 15 || jtf.getText().length() == 0){
            button.setEnabled(false);
            throw new Exception("0 < " + jtf.getText().length() + " characters <= 15 is invalid");
        } else if(hasSpecialChars(jtf)) {
            button.setEnabled(false);
            throw new Exception("Names are not allowed to have special characters");
        } else if(hasDigits(jtf)){
            System.out.print("Hi");
            button.setEnabled(false);
            throw new Exception("Names are not allowed to have digits");
        }
        
        return true;

    }

    public boolean checkAge(JTextField jtf, JButton button) throws Exception{
        if(jtf.getText().equals("")){
            button.setEnabled(false);
            throw new Exception("Age cannot be blank");
        } else if(Integer.parseInt(jtf.getText()) >= 0 && Integer.parseInt(jtf.getText()) <= 100){
            return true;
        } else{
            button.setEnabled(false);
            throw new Exception("AgeException: 0<= " + jtf.getText() + " <= 100 is invalid.");
        }
        
    }

    public boolean hasDigits(JTextField jtf) {
        for(int i = 0; i < jtf.getText().length(); i++) {
            if(Character.isDigit(jtf.getText().charAt(i))) {
                return true;
            }
        }
    return false;
    }

    public boolean hasSpecialChars(JTextField jtf) {
        Pattern pattern = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(jtf.getText()).find();
    }
}
