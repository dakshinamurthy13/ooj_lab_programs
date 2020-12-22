import java.awt.*;
import java.awt.event.*;

class TextFieldPasting extends Frame implements ActionListener{
    TextField text1,text2;
    Button paste;
    public TextFieldPasting(){
        setLayout(new FlowLayout());
        
        text1=new TextField(10);
        Label text1Label=new Label("Text Box 1 :");
        text2=new TextField(10);
        paste=new Button("Paste");
        Label text2Label=new Label("Text Box 2 :");
        add(text1Label);
        add(text1);
        add(paste);
        add(text2Label);
        add(text2);

        paste.addActionListener(this);
        addWindowListener(new MyWindow());
    }
    public void actionPerformed(ActionEvent ae){
        String s1=text1.getText();
        text2.setText(s1);
    }
    public static void main(String args[]){
        TextFieldPasting pasting=new TextFieldPasting();
        pasting.setSize(1000,400);
        pasting.setTitle("Text Field Copy Paste");
        pasting.setVisible(true);
    }
}
class MyWindow extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}