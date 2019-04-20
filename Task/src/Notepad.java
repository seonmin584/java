import javax.swing.*;
import java.awt.*;

public class Notepad extends JFrame {
	public Notepad () {
		setTitle("메모장");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		Container c = getContentPane();
		JMenuBar mb = new JMenuBar();
		JMenu FileMenu = new JMenu("파일(F)");
		JMenu EditingMenu = new JMenu("편집(E)");
		JMenu FormMenu = new JMenu("서식(O)");
		JMenu ViewMenu = new JMenu("보기(V)");
		JMenu HelpMenu = new JMenu("도움말H)");
		mb.setBackground(Color.YELLOW);
		
		c.setBackground(Color.RED);
		c.add(new JTextArea());

		mb.add(FileMenu);
		mb.add(EditingMenu);
		mb.add(FormMenu);
		mb.add(ViewMenu);
		mb.add(HelpMenu);
		setJMenuBar(mb);
		
		setSize(300, 300);
	}
	
	public static void main(String[] args) {
		new Notepad();
	}

}