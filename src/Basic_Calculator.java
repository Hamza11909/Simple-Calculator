import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Basic_Calculator {

	private JFrame frmCalculator;
	private JTextField btnAnsPanel;
	public double firstnum, secondnum, result;
	public String Operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Basic_Calculator window = new Basic_Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Basic_Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setForeground(Color.BLACK);
		frmCalculator.setBackground(Color.DARK_GRAY);
		frmCalculator.getContentPane().setBackground(Color.DARK_GRAY);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 472, 550);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		btnAnsPanel = new JTextField();
		btnAnsPanel.setBounds(36, 65, 380, 73);
		btnAnsPanel.setEditable(false);
		btnAnsPanel.setHorizontalAlignment(SwingConstants.RIGHT);
		btnAnsPanel.setForeground(Color.WHITE);
		btnAnsPanel.setBackground(Color.GRAY);
		btnAnsPanel.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmCalculator.getContentPane().add(btnAnsPanel);
		btnAnsPanel.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(39, 226, 79, 50);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = btnAnsPanel.getText()+btn1.getText();
				btnAnsPanel.setText(EnterNumber);
			}
		});
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(128, 226, 79, 50);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = btnAnsPanel.getText()+btn2.getText();
				btnAnsPanel.setText(EnterNumber);	
			}
		});
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(217, 226, 79, 50);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = btnAnsPanel.getText()+btn3.getText();
				btnAnsPanel.setText(EnterNumber);	
			}
		});
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(39, 287, 79, 50);
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = btnAnsPanel.getText()+btn4.getText();
				btnAnsPanel.setText(EnterNumber);	
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(128, 287, 79, 50);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = btnAnsPanel.getText()+btn5.getText();
				btnAnsPanel.setText(EnterNumber);	
			}
		});
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(217, 287, 79, 50);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = btnAnsPanel.getText()+btn6.getText();
				btnAnsPanel.setText(EnterNumber);	
			}
		});
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(39, 348, 79, 50);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = btnAnsPanel.getText()+btn7.getText();
				btnAnsPanel.setText(EnterNumber);	
			}
		});
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(128, 348, 79, 50);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = btnAnsPanel.getText()+btn8.getText();
				btnAnsPanel.setText(EnterNumber);
			}
		});
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(217, 348, 79, 50);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = btnAnsPanel.getText()+btn9.getText();
				btnAnsPanel.setText(EnterNumber);	
			}
		});
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(128, 409, 79, 50);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = btnAnsPanel.getText()+btn0.getText();
				btnAnsPanel.setText(EnterNumber);	
			}
		});
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btn0);
		
		JButton btnCe = new JButton("+/-");
		btnCe.setBounds(39, 409, 79, 50);
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double ops = Double.parseDouble(String.valueOf(btnAnsPanel.getText()));
				//double ops = Double.parseDouble(String.valueOf(btnAnsPanel.getText()));
				ops = ops * (-1);
				btnAnsPanel.setText(String.valueOf(ops));
				}
			});
		btnCe.setBackground(Color.LIGHT_GRAY);
		btnCe.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btnCe);
		
		JButton btndot = new JButton(".");
		btndot.setBounds(217, 409, 79, 50);
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(! btnAnsPanel.getText().contains("."))
		          {
					btnAnsPanel.setText(btnAnsPanel.getText() + btndot.getText());
		          }
			}
		});
		btndot.setBackground(Color.LIGHT_GRAY);
		btndot.setFont(new Font("Tahoma", Font.BOLD, 17));
		frmCalculator.getContentPane().add(btndot);
		
		JButton btnCe1 = new JButton("CE");
		btnCe1.setBounds(39, 164, 79, 51);
		btnCe1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				btnAnsPanel.setText(null);
			}
		});
		btnCe1.setBackground(Color.LIGHT_GRAY);
		btnCe1.setFont(new Font("Tahoma", Font.BOLD, 17));
		frmCalculator.getContentPane().add(btnCe1);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(128, 165, 79, 50);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				btnAnsPanel.setText(null);
			}
		});
		btnC.setBackground(Color.LIGHT_GRAY);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmCalculator.getContentPane().add(btnC);
		
		JButton btnbkspace = new JButton("\u2190");
		btnbkspace.setBounds(217, 164, 79, 50);
		btnbkspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String backspace=null;
				if(btnAnsPanel.getText().length()>0)
				{
					StringBuilder strB =new StringBuilder(btnAnsPanel.getText());
					strB.deleteCharAt(btnAnsPanel.getText().length()-1);
					backspace=strB.toString();
					btnAnsPanel.setText(backspace);
				}
			}
		});
		btnbkspace.setBackground(Color.LIGHT_GRAY);
		btnbkspace.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmCalculator.getContentPane().add(btnbkspace);
		
		JButton btndiv = new JButton("\u00F7");
		btndiv.setBounds(337, 163, 79, 50);
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum=Double.parseDouble(btnAnsPanel.getText());
				btnAnsPanel.setText("");
				Operation="÷";
			}
		});
		btndiv.setBackground(Color.LIGHT_GRAY);
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 17));
		frmCalculator.getContentPane().add(btndiv);
		
		JButton btnmult = new JButton("x");
		btnmult.setBounds(337, 225, 79, 50);
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum=Double.parseDouble(btnAnsPanel.getText());
				btnAnsPanel.setText("");
				Operation="x";
			}
		});
		btnmult.setBackground(Color.LIGHT_GRAY);
		btnmult.setFont(new Font("Tahoma", Font.BOLD, 17));
		frmCalculator.getContentPane().add(btnmult);
		
		JButton btnsubtr = new JButton("-");
		btnsubtr.setBounds(337, 286, 79, 50);
		btnsubtr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum=Double.parseDouble(btnAnsPanel.getText());
				btnAnsPanel.setText("");
				Operation="-";
			}
		});
		btnsubtr.setBackground(Color.LIGHT_GRAY);
		btnsubtr.setFont(new Font("Tahoma", Font.BOLD, 17));
		frmCalculator.getContentPane().add(btnsubtr);
		
		JButton btnadd = new JButton("+");
		btnadd.setBounds(337, 347, 79, 50);
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum=Double.parseDouble(btnAnsPanel.getText());
				btnAnsPanel.setText("");
				Operation="+";
			}
		});
		btnadd.setBackground(Color.LIGHT_GRAY);
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 17));
		frmCalculator.getContentPane().add(btnadd);
		
		JButton btnequalsto = new JButton("=");
		btnequalsto.setBounds(337, 408, 79, 50);
		btnequalsto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				{
					String answer;
					secondnum=Double.parseDouble(btnAnsPanel.getText());
					if(Operation=="+")												//ADDITION
					{
						result=firstnum+secondnum;
						answer=String.format("%.1f", result);
						btnAnsPanel.setText(answer);
					}
					else if(Operation=="-")											//SUBTRACTION
					{
						result=firstnum-secondnum;
						answer=String.format("%.1f", result);
						btnAnsPanel.setText(answer);
					}
					else if(Operation=="x")											//MULTIPLY
					{
						result=firstnum*secondnum;
						answer=String.format("%.1f", result);
						btnAnsPanel.setText(answer);
					}	
					else if(Operation=="÷")											//DIVISION
					{
						result= (firstnum / secondnum) * 100;
						answer=String.format("%.2f", result);
						btnAnsPanel.setText(answer);
					}		
					
				}
			}
		});
		btnequalsto.setBackground(Color.LIGHT_GRAY);
		btnequalsto.setFont(new Font("Tahoma", Font.BOLD, 17));
		frmCalculator.getContentPane().add(btnequalsto);
	}
}
