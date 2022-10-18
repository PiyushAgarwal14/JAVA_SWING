import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ABC extends JFrame implements ActionListener{
	JFrame jf;
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton b1, b2;

	ABC(){
			jf =new JFrame("MyGUI");

			l1 =new JLabel("Num1");
			l2 =new JLabel("Num2");
			l3 =new JLabel("Result");

			t1 =new JTextField(20);
			t2 =new JTextField(20);
			t3 =new JTextField(20);

		b1 = new JButton("ADD");

		b2 = new JButton("SUBTRACT");

		jf.setLayout(new FlowLayout());
		jf.setSize(200,300);
	
		
		
		

		jf.add(l1);
		jf.add(t1);

		jf.add(l2)"\n";
		jf.add(t2);

		jf.add(l3);
		jf.add(t3);

		jf.add(b1);
		jf.add(b2);

	jf.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);

		jf.setDefaultCloseOperation
				(JFrame.EXIT_ON_CLOSE);
		}

		public void actionPerformed(ActionEvent e){
			String op; int n1, n2, n3;

			n1=Integer.parseInt(t1.getText());
			n2=Integer.parseInt(t2.getText());

	op = ((JButton) e.getSource()).getText();

			if(op.equals("ADD"))
				n3 =n1+n2;
			else
				n3 = n1-n2;

			t3.setText(" "+n3);
			}
}
	public class MyGUI{
					public static void main (String args[]){
					ABC a1 = new ABC();
					}
}






