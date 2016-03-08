import java.awt.EventQueue;
import java.math.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btnLPar;
	private JButton btnExponent;
	private JButton btnSqrt;
	private JButton btnClear;
	private JButton Num_1;
	private JButton Num_2;
	private JButton Num_3;
	private JButton Num_4;
	private JButton Num_5;
	private JButton Num_6;
	private JButton Num_7;
	private JButton Num_8;
	private JButton Num_9;
	private JButton Num_0;
	private JButton Num_Decimal;
	private JButton Button_Sub;
	private JButton Button_Add;
	private JButton Button_Mult;
	private JButton btnBack;
	private JButton Button_Divide;
	private JButton btnEnter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}
	/**
	 * appends specified button to the TextField.
	 * @param button
	 */
	public void buttonAppend(final JButton button){
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textField.setText(textField.getText()+button.getText());
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText("");
		textField.setBounds(10, 11, 414, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnRPar = new JButton(")");
		btnRPar.setBounds(347, 88, 77, 49);
		frame.getContentPane().add(btnRPar);
		
		btnLPar = new JButton("(");
		btnLPar.setBounds(271, 88, 77, 49);
		frame.getContentPane().add(btnLPar);
		
		btnExponent = new JButton("^x");
		btnExponent.setBounds(173, 88, 88, 49);
		frame.getContentPane().add(btnExponent);
		
		btnSqrt = new JButton(" \u221A");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSqrt.setBounds(86, 88, 77, 49);
		frame.getContentPane().add(btnSqrt);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnClear.setBounds(10, 88, 77, 49);
		frame.getContentPane().add(btnClear);
		
		Num_1 = new JButton("1");
		buttonAppend(Num_1);
		Num_1.setBounds(2, 172, 77, 49);
		frame.getContentPane().add(Num_1);
		
		Num_2 = new JButton("2");
		buttonAppend(Num_2);
		Num_2.setBounds(78, 172, 77, 49);
		frame.getContentPane().add(Num_2);
		
		Num_3 = new JButton("3");
		buttonAppend(Num_3);
		Num_3.setBounds(155, 172, 77, 49);
		frame.getContentPane().add(Num_3);
		
		Num_4 = new JButton("4");
		buttonAppend(Num_4);
		Num_4.setBounds(2, 219, 77, 49);
		frame.getContentPane().add(Num_4);
		
		Num_5 = new JButton("5");
		buttonAppend(Num_5);
		Num_5.setBounds(78, 219, 77, 49);
		frame.getContentPane().add(Num_5);
		
		Num_6 = new JButton("6");
		buttonAppend(Num_6);
		Num_6.setBounds(155, 219, 77, 49);
		frame.getContentPane().add(Num_6);
		
		Num_7 = new JButton("7");
		buttonAppend(Num_7);
		Num_7.setBounds(2, 268, 77, 49);
		frame.getContentPane().add(Num_7);
		
		Num_8 = new JButton("8");
		buttonAppend(Num_8);
		Num_8.setBounds(78, 268, 77, 49);
		frame.getContentPane().add(Num_8);
		
		Num_9 = new JButton("9");
		buttonAppend(Num_9);
		Num_9.setBounds(155, 268, 77, 49);
		frame.getContentPane().add(Num_9);
		
		Num_0 = new JButton("0");
		buttonAppend(Num_0);
		Num_0.setBounds(2, 316, 153, 49);
		frame.getContentPane().add(Num_0);
		
		Num_Decimal = new JButton(".");
		buttonAppend(Num_Decimal);
		Num_Decimal.setBounds(155, 316, 77, 49);
		frame.getContentPane().add(Num_Decimal);
		
		Button_Sub = new JButton("-");
		buttonAppend(Button_Sub);
		Button_Sub.setBounds(260, 172, 77, 49);
		frame.getContentPane().add(Button_Sub);
		
		Button_Add = new JButton("+");
		buttonAppend(Button_Add);
		Button_Add.setBounds(336, 172, 88, 96);
		frame.getContentPane().add(Button_Add);
		
		Button_Mult = new JButton("*");
		buttonAppend(Button_Mult);
		Button_Mult.setBounds(260, 219, 77, 49);
		frame.getContentPane().add(Button_Mult);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int length = textField.getText().length();
				if(length==0){}
				else{textField.setText(textField.getText().substring(0,length-1));}
			}
		});
		btnBack.setBounds(260, 316, 77, 49);
		frame.getContentPane().add(btnBack);
		
		Button_Divide = new JButton("/");
		buttonAppend(Button_Divide);
		Button_Divide.setBounds(260, 268, 77, 49);
		frame.getContentPane().add(Button_Divide);
		
		btnEnter = new JButton("Enter");
		btnEnter.setBounds(336, 268, 88, 97);
		frame.getContentPane().add(btnEnter);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{textField, btnClear, btnSqrt, btnExponent, btnLPar, btnRPar, Num_1, Num_2, Num_3, Num_4, Num_5, Num_6, Num_7, Num_8, Num_9, Num_0, Num_Decimal, Button_Sub, Button_Add, Button_Mult, btnBack, Button_Divide, btnEnter}));
	}
}
