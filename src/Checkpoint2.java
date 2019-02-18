import javax.swing.JOptionPane;

public class Checkpoint2 {
	public static void main(String[] args) {
		int[] ALT = new int[5];
		String ET;
		int DD;
		for (int i = 0; i < ALT.length; i++) {
			ET = JOptionPane.showInputDialog("Pick a number");
			DD = Integer.parseInt(ET);
			
		}
		for (int j = 0; j < ALT.length; j++) {
			JOptionPane.showMessageDialog(null, "hi");
		}
	}
}