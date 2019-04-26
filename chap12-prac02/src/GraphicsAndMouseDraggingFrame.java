import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsAndMouseDraggingFrame extends JFrame{
	public GraphicsAndMouseDraggingFrame() {
		super("�̹��� ���� �� �巡�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage();
		private int ovalX=100, ovalY=100; // ���� �߽� ��ǥ
		private final int RADIUS = 20; // ���� ������
		
		public MyPanel() {
			addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent e) {
					ovalX = e.getX();
					ovalY = e.getY();
					repaint(); // paintComponent()�� �Ͽ��� ovalX, ovalY�� ��ġ�� �ٽ� �׸��Ⱑ ����
				}
			});
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(ovalX, ovalY, RADIUS, RADIUS); // ������ 20 �ȼ� ¥���� ä�� �� �׸���
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsAndMouseDraggingFrame();
	}

}
