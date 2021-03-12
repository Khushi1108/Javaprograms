import java.awt.*;
import java.awt.event.*;

class menubar extends Frame{
    menubar(){
        MenuBar mb = new MenuBar();
        
        Menu menu = new Menu("Menu");
        Menu submenu = new Menu("Submenu");
        MenuItem i1 = new MenuItem("i1");
        MenuItem i2 = new MenuItem("i2");
        MenuItem i3 = new MenuItem("i3");
        MenuItem i4 = new MenuItem("i4");
        MenuItem i5 = new MenuItem("i5");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        mb.add(menu);
        menu.add(submenu);
        setLayout(null);
        setSize(600,600);
        setVisible(true);
        setMenuBar(mb);
    }

    public static void main(String args[]){
        menubar m = new menubar();
    }
}