package GuiPackage;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("Enter your Name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));		
		double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));		
		JOptionPane.showMessageDialog(null,"Your Age is :"+ age+  "Your Age is :"+ height+"cm");
		
		

	}

}
