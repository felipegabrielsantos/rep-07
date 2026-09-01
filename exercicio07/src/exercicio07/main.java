package exercicio07;
import javax.swing.JOptionPane;
public class main {
	public static void main(String[] args) {
		int mp1 = Integer.parseInt(JOptionPane.showInputDialog("mes pessoa 1"));
		int dp1 = Integer.parseInt(JOptionPane.showInputDialog("dia pessoa 1"));
		int mp2 = Integer.parseInt(JOptionPane.showInputDialog("mes pessoa 2"));
		int dp2 = Integer.parseInt(JOptionPane.showInputDialog("dia pessoa 2"));
		
		if ((mp1 >= 1 && mp1 <= 12) && (mp2 >= 1 && mp2 <= 12) && (dp1 >= 1 && dp1 <= 31) && (dp2 >= 1 && dp2 <= 31)) {
			int r1 = dp1 + (mp1 - 1) * 31;
			int r2 = dp2 + (mp2 - 1) * 31;
			
			if (r1 > r2) { JOptionPane.showMessageDialog(null, "a segunda pessoa faz aniversario primeiro");} 
			else if (r1 < r2) {JOptionPane.showMessageDialog(null, "a primeira pessoa faz aniversario primeiro");} 
			else if (r1 == r2) {JOptionPane.showMessageDialog(null, "as duas pessoas fazem aniversario no mesmo dia");}} 
			else {JOptionPane.showMessageDialog(null, "insira valores dentro dos intervalos adequados\nmes: 1-12\ndia: 1-31" );}
	}
}
