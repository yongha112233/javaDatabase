package t3_swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//스윙은 앞에J

@SuppressWarnings("serial")
public class T02_Radio extends JFrame{
	public T02_Radio() {
		super("스윙연습(라디오버튼)");
		designView();
	}
	
	private void designView() {
		setSize(400, 300);               
		setLocationRelativeTo(null); 	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		setResizable(false); 
		
		setLayout(new FlowLayout());
		
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		
		pn1.setBackground(Color.blue);
		pn2.setBackground(Color.gray);
		
		JLabel lbl = new JLabel();
		lbl.setText("스위연습하기");
		pn1.add(lbl);
		
		JButton btnExit = new JButton("종료");
		pn2.add(btnExit);
		
		add(pn1);
		add(pn2);
		
		
		setVisible(true);
//		 -----------------------------위쪽은 사용자 인터페이스구현(UI) , 아래쪽은 method(동작) 처리 ---------------------------------
		
		//종료버튼 클릭시 수행
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new T02_Radio();
		
	}
}
