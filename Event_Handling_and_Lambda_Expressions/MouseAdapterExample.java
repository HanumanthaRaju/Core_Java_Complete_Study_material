import java.awt.*;  
import java.awt.event.*;  
public class MouseAdapterExample extends MouseAdapter
{  
    Frame f;  
    Label f1;

    MouseAdapterExample()
    {  
        f=new Frame("Mouse Adapter"); 
        f1=new Label(); 
        f.addMouseListener(this);  
          
        f.setSize(300,300);  
        f.setLayout(null);  
        f.add(f1);
        f1.setBounds(10,20,100,200);
        f.setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) 
    {  
        /*Graphics g=f.getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(e.getX(),e.getY(),30,30);  */
        f1.setText("Mouse Clicked"+e.getX()+e.getY());
    }  
      
    public static void main(String[] args) 
    {  
        new MouseAdapterExample();  
    }  
}  