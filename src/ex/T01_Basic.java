package ex;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class T01_Basic {

	private JFrame frame;
	private JTextField txtMid;
	private JPasswordField txtPwd;
	private JTextField txtName;
	private JTextField txtAge;

	public static void main(String[] args) {
		new T01_Basic();
	}

	public T01_Basic() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		//frame.setBounds(100, 100, 800, 600);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnInput = new JButton("회원가입");
		btnInput.setFont(new Font("굴림", Font.BOLD, 20));
		btnInput.setBounds(46, 472, 200, 40);
		frame.getContentPane().add(btnInput);
		
		JButton btnReset = new JButton("다시입력");
		btnReset.setFont(new Font("굴림", Font.BOLD, 20));
		btnReset.setBounds(292, 472, 200, 40);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("작업종료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 20));
		btnExit.setBounds(538, 472, 200, 40);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(73, 30, 215, 56);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(73, 96, 215, 56);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("성명");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(73, 162, 215, 56);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("나이");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_3.setBounds(73, 228, 215, 56);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtMid = new JTextField();
		txtMid.setFont(new Font("굴림", Font.BOLD, 20));
		txtMid.setBounds(314, 35, 379, 47);
		frame.getContentPane().add(txtMid);
		txtMid.setColumns(10);
		
		txtPwd = new JPasswordField();
		txtPwd.setFont(new Font("굴림", Font.PLAIN, 20));
		txtPwd.setBounds(314, 101, 379, 47);
		frame.getContentPane().add(txtPwd);
		
		txtName = new JTextField();
		txtName.setFont(new Font("굴림", Font.BOLD, 20));
		txtName.setColumns(10);
		txtName.setBounds(314, 162, 379, 47);
		frame.getContentPane().add(txtName);
		
		txtAge = new JTextField();
		txtAge.setText("0");
		txtAge.setFont(new Font("굴림", Font.BOLD, 20));
		txtAge.setColumns(10);
		txtAge.setBounds(314, 228, 379, 47);
		frame.getContentPane().add(txtAge);
		
		JLabel lblNewLabel_3_1 = new JLabel("자기소개");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(73, 294, 215, 56);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(314, 309, 379, 136);
		frame.getContentPane().add(scrollPane);
		
		JTextArea txtaContent = new JTextArea();
		scrollPane.setViewportView(txtaContent);
		
		frame.setVisible(true);
		
// ------------------------위쪽은 디자인 , 아래쪽은 메소드------------------------------------------------------
		
		// 종료버튼 클릭시 수행
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnExit.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.exit(0);
			}
		});
		
		// 회원가입버튼 클릭시 수행
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mid = txtMid.getText();
				String pwd = txtPwd.getText();
				String name = txtName.getText();
				int age = Integer.parseInt(txtAge.getText());
				String content = txtaContent.getText();
				
				if(mid.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디는 필수 입력입니다.", "회원가입창", JOptionPane.WARNING_MESSAGE);
					txtMid.requestFocus();
				}
				else if(pwd.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호 필수 입력입니다.", "회원가입창", JOptionPane.WARNING_MESSAGE);
					txtPwd.requestFocus();
				}
				else if(name.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "성명은 필수 입력입니다.", "회원가입창", JOptionPane.WARNING_MESSAGE);
					txtName.requestFocus();
				}
				else {
					JOptionPane.showMessageDialog(null, "회원에 가입합니다.", "회원가입", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		
		
	}
}
