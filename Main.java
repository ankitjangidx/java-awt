import java.awt.*;

/*method 1 for create a frame as has a relation
public class Main {
public static void main(String[] args) {
Frame f=new Frame("first app");
 }
}*/
// method 2
class Myframe extends Frame{
Label l;
TextField tf;
Button b;
  public Myframe(){
    super("my first app");
    setLayout(new FlowLayout());
    
    l=new Label("name");
    tf=new TextField(20);
    b=new Button("ok");
    add(l);
    add(b);
    add(tf);
  }
  
  
  
}
  public class Main {
public static void main(String[] args) {
Myframe f=new Myframe();
  f.setSize(400,400);
  f.setVisible(true);
 }

}
