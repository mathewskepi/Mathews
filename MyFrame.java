 
package frame;
import java.awt.GridLayout;
 import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MyFrame extends JFrame implements ActionListener{
    
    private JLabel jlName, greeting;
    private JTextField jtName;
    private JButton jbOK, jbClear;
    
    public void create()
    {
        JPanel panel = new JPanel();
        setLayout(new GridLayout(2,2));
        add(panel);
        
        jlName = new JLabel("Name");
        jtName = new JTextField(15);
        jbOK = new JButton("OK");
        jbClear = new JButton("Clear");
        greeting = new JLabel("");
        
        panel.add(jlName);
        panel.add(greeting);
        panel.add(jtName);
        panel.add(jbClear);
        panel.add(jbOK);
        
        setTitle("Fav Frame");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jbClear.addActionListener(this);
        //setDefaultLookAndFeelDecorated(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String name = jtName.getText();
         String greet = "Hello, "+name;
         greeting.setText(greet);
    }
}
