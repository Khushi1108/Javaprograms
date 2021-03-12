import java.awt.*;
import java.awt.event.*;
// Event handling of a Button.

class button extends Frame 
{
    TextField tf;
    button(){
        tf=new TextField();
        Button b=new Button("Click Me");
        b.setBounds(100,80,100,20);
        tf.setBounds(100,150,100,20);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        add(tf);
        add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("hello world");
            }
        });
    }

    public static void main(String args[]){
        button g = new button();
    }
}