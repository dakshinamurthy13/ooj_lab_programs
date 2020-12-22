import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener{
    TextField num1,num2,result,operator;
    Button calculate;
    public Calculator(){
        setLayout(new FlowLayout());

        num1=new TextField(5);
        num2=new TextField(5);
        operator=new TextField(1);
        result=new TextField(10);

        Label num1Label=new Label("Num 1:");
        Label num2Label=new Label("Num 2:");
        Label resultLabel=new Label("Result :");
        Label operatorLabel=new Label("Operator :");

        calculate=new Button("Calculate");

        add(num1Label);
        add(num1);
        add(num2Label);
        add(num2);
        add(operatorLabel);
        add(operator);
        add(calculate);
        add(resultLabel);
        add(result);

        calculate.addActionListener(this);

        addWindowListener(new MyWindow());
    }
    public void actionPerformed(ActionEvent ae){
        int num1Int=Integer.parseInt(num1.getText());
        int num2Int=Integer.parseInt(num2.getText());
        float resultActual;
        char op=operator.getText().charAt(0);
        switch(op){
            case '+':
                resultActual=num1Int+num2Int;
                result.setText(Float.toString(resultActual));
                break;
            case '-':
                resultActual=num1Int-num2Int;
                result.setText(Float.toString(resultActual));
                break;
            case '/':
                resultActual=(float)num1Int/num2Int;
                result.setText(Float.toString(resultActual));
                break;
            case '*':
                resultActual=num1Int*num2Int;
                result.setText(Float.toString(resultActual));
                break;
            default:
                MyDialog d=new MyDialog(this,"Error","Please Enter valid operator");
                d.setVisible(true);
        }
    }
    public static void main(String args[]){
        Calculator c=new Calculator();
        c.setSize(1000,500);
        c.setTitle("Calculator");
        c.setVisible(true);
    }
}
class MyWindow extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}
class MyDialog extends Dialog implements ActionListener{
    public MyDialog(Frame parent,String title,String msg){
        super(parent,title,false);
        setLayout(new FlowLayout());
        setSize(500, 200); 
        add(new Label(msg));
        Button ok=new Button("OK");
        add(ok);
        ok.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ea){
        dispose();
    }
}