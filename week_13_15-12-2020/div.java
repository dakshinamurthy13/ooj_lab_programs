import java.awt.*;
import java.awt.event.*;
class DivisionInteger extends Frame implements ActionListener{
    TextField num1TextField;
    TextField num2TextField;
    Button calculate;
    int a,b;
    float result;
    String msg="Enter the numbers";
    public DivisionInteger(){
        
        setLayout(new FlowLayout());

        calculate=new Button("Calculate");
        num1TextField=new TextField(5);
        Label num1Label=new Label("Number 1",Label.RIGHT);
        num2TextField=new TextField(5);
        Label num2Label=new Label("Number 2",Label.RIGHT);
        
        add(num1Label);
        add(num1TextField);
        add(num2Label);
        add(num2TextField);
        add(calculate);
        num1TextField.addActionListener(this);
        num2TextField.addActionListener(this);
        calculate.addActionListener(this);

        addWindowListener(new MyWindowAdapter());
    }
    public void actionPerformed(ActionEvent ae){
        try{
            result=divideNumbers();
            msg=("The result is "+result);
        }catch(NumberFormatException e){
            msg="Number is not Integer."+e;
        }catch(ArithmeticException e){
            msg="Divide By zero not Allowed."+e;
        }finally{
           MyDialog d = new MyDialog(this, "Dialog");
            d.setVisible(true);
        }
    }
    public float divideNumbers(){
        a=Integer.parseInt(num1TextField.getText());
        b=Integer.parseInt(num2TextField.getText());
        if(b==0){
            throw new ArithmeticException();
        }
        return (float)a/b;
    }
    public static void main(String args[]){
        DivisionInteger div=new DivisionInteger();
        div.setSize(new Dimension(1000,200));
        div.setTitle("Division Calculater");
        div.setVisible(true);
    }
}
class MyWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent event){
        System.exit(0);
    }
}
class MyDialog extends Dialog implements ActionListener{
    DivisionInteger divInt;
    public MyDialog(Frame parent,String title){
        super(parent,title,false);
        divInt=(DivisionInteger)parent;
        setLayout(new FlowLayout());
        setSize(500, 200); 
        add(new Label(divInt.msg));
        Button ok=new Button("OK");
        add(ok);
        ok.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ea){
        dispose();
    }
}