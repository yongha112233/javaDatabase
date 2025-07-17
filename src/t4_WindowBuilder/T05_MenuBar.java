package t4_WindowBuilder;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class T05_MenuBar {

	private JFrame frame;


	public static void main(String[] args) {
		new T05_MenuBar();
				
	}


	public T05_MenuBar() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("메뉴연습");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(T05_MenuBar.class.getResource("/t4_WindowBuilder/images/Image20250717122328.jpg")));
		toolBar.add(btnNewButton);
		
		JButton btnOpen = new JButton("");
		btnOpen.setIcon(new ImageIcon(T05_MenuBar.class.getResource("/t4_WindowBuilder/images/Image20250717122335.jpg")));
		toolBar.add(btnOpen);
		
		JButton btnSave = new JButton("");
		btnSave.setIcon(new ImageIcon(T05_MenuBar.class.getResource("/t4_WindowBuilder/images/Image20250717122342.jpg")));
		toolBar.add(btnSave);
		
//		JSeparator separator_1 = new JSeparator();
//		toolBar.add(separator_1);
		toolBar.addSeparator();
		
		JButton btnExit = new JButton("");
		btnExit.setIcon(new ImageIcon(T05_MenuBar.class.getResource("/t4_WindowBuilder/images/Image20250717122339.jpg")));
		toolBar.add(btnExit);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Open");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Save");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Exit");
		
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("About");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("About SpringGroup");
		mnNewMenu_2.add(mntmNewMenuItem_4);

		frame.setVisible(true);
		
//		---------------------------------위쪽은 디자인 , 아래쪽은 메소드-----------------------------------
		//About 버튼 클릭시 수행
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "SpringGroup Ver 1.0");
			}
		});
		
		// 종료버튼을 마우스로 클릭시 수행
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(frame, "작업을 종료할까요?", "작업종료", JOptionPane.YES_NO_OPTION);
				if(ans == 0) System.exit(0);
			}
		});
		
		//메뉴의 Exit버튼 클릭시 수행
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(frame, "작업을 종료할까요?", "작업종료", JOptionPane.YES_NO_OPTION);
				if(ans == 0) System.exit(0);
			}
		});
		
		
	}

}
