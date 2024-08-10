import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
JFrame frame;
JTextField text;
double firstNumber;
double secondNumber;
double result;
char op;
public Calculator()
{
	frame=new JFrame("Calculator");
	Font font=new Font("ARIAL",Font.BOLD,30);
	text=new JTextField();
	JPanel panel=new JPanel(new GridLayout(0,4,20,20));
	
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	JButton b3=new JButton("3");
	JButton b4=new JButton("4");
	JButton b5=new JButton("5");
	JButton b6=new JButton("6");
	JButton b7=new JButton("7");
	JButton b8=new JButton("8");
	JButton b9=new JButton("9");
	JButton b0=new JButton("0");
	JButton b10=new JButton(".");
	JButton b11=new JButton("+");
	JButton b12=new JButton("-");
	JButton b13=new JButton("*");
	JButton b14=new JButton("/");
	JButton b15=new JButton("%");
	JButton b16=new JButton("X^2");
	JButton b17=new JButton("1/X");
	JButton b18=new JButton("C");
	JButton b19=new JButton("=");
	b1.setFont(font);
	b2.setFont(font);
	b3.setFont(font);
	b4.setFont(font);
	b5.setFont(font);
	b6.setFont(font);
	b7.setFont(font);
	b8.setFont(font);
	b9.setFont(font);
	b0.setFont(font);
	b10.setFont(font);
	b11.setFont(font);
	b12.setFont(font);
	b13.setFont(font);
	b14.setFont(font);
	b15.setFont(font);
	b16.setFont(font);
	b17.setFont(font);
	b18.setFont(font);
	b19.setFont(font);
	
	text.setFont(font);
	text.setEditable(false);
	// to not to type anything on the textfield
	b1.addActionListener(new ActionListener()
			{
		public void actionPerformed(ActionEvent e)
		{
			//when we click on the button to add to the text field we write this
			String s=text.getText();
			text.setText(s+"1");
		}
			});
	b2.addActionListener(new ActionListener()
			{
		public void actionPerformed(ActionEvent e)
		{
			text.setText(text.getText()+"2");
		}
			});
	b3.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	text.setText(text.getText()+"3");
}
	});
	b4.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	text.setText(text.getText()+"4");
}
	});
	b5.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	text.setText(text.getText()+"5");
}
	});
	b6.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	text.setText(text.getText()+"6");
}
	});
	b7.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	text.setText(text.getText()+"7");
}
	});
	b8.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	text.setText(text.getText()+"8");
}
	});	
	b9.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	text.setText(text.getText()+"9");
}
	});
	b0.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	text.setText(text.getText()+"0");
}
	});
	b10.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	if(!text.getText().contains("."))
		text.setText(text.getText()+".");
}
	});
	b11.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	firstNumber=Double.parseDouble(text.getText());
	text.setText("");
	op='+';
}
	});
	b12.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	firstNumber=Double.parseDouble(text.getText());
	text.setText("");
	op='-';
}
	});
	b13.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	firstNumber=Double.parseDouble(text.getText());
	text.setText("");
	op='*';
}
	});
	b14.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	firstNumber=Double.parseDouble(text.getText());
	text.setText("");
	op='/';
}
	});
	b15.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	firstNumber=Double.parseDouble(text.getText());
	text.setText("");
	op='%';
}
	});
	b16.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	text.setText(Math.pow(Double.parseDouble(text.getText()),2.0)+"");
}
	});
	b17.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	double d=Double.parseDouble(text.getText());
	text.setText((1/d)+"");
	
}
	});
	b18.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	firstNumber=0;
	secondNumber=0;
	result=0;
	text.setText("");
	
}
	});
	b19.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	secondNumber=Double.parseDouble(text.getText());
	switch(op)
	{
	case '+':
		result=firstNumber+secondNumber;
		break;
	case '-':
		result=firstNumber - secondNumber;
		break;
	case '*':
		result=firstNumber * secondNumber;
		break;
	case '/':
		result=firstNumber / secondNumber;
		break;
	case '%':
		result=firstNumber % secondNumber;
		break;
	}
	text.setText(result+ "");//concatinating the string get string 
}
	});


	
	panel.add(b1);
	panel.add(b2);
	panel.add(b3);
	panel.add(b4);
	panel.add(b5);
	panel.add(b6);
	panel.add(b7);
	panel.add(b8);
	panel.add(b9);
	panel.add(b0);
	panel.add(b10);
	panel.add(b11);
	panel.add(b12);
	panel.add(b13);
	panel.add(b14);
	panel.add(b15);
	panel.add(b16);
	panel.add(b17);
	panel.add(b18);
	panel.add(b19);
	
	
	
	
	
	
	
	frame.add(text,BorderLayout.NORTH);
	frame.add(panel);
	frame.setResizable(false);//to stop resizing the frame
	frame.setSize(500,600);
	frame.setVisible(true);

	
}
	public static void main(String[] args) {
	new Calculator();

	}

}
