import java.awt.*;  
class Detail{  
public static void main(String args[]){  
    Frame f= new Frame("Details");  
    Label l1,l2,l3,l4;  
    l1=new Label("Name :  Khushi Parmar "); 
    l1.setBounds(50,100, 200,30);  
    l2=new Label("Roll no : 19100BTIT06573");
    l2.setBounds(50,150, 200,30); 
    l3=new Label("branch : Information Technology"); 
    l3.setBounds(50,200, 200,30);
    l4=new Label("session : 2021-2022");
    l4.setBounds(50,250, 200,30); 
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
}  