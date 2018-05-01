import javax.swing.*;
        import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    private JButton JAdd = new JButton("+");
    private JButton JLess = new JButton("-");
    private JLabel JEmo = new JLabel(">___________<");
    private int  x=0;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setSize(800, 600);
        this.setLocation(50,100);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(JAdd);
        this.add(JLess);
        this.add(JEmo);
        JAdd.setSize(100,100);
        JAdd.setLocation(100,100);
        JLess.setSize(100,100);
        JLess.setLocation(210, 100);
        JEmo.setBounds(x,300,100,100);
        JAdd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x += 20;
                JEmo.setLocation(x,300);
            }
        });
        JLess.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x -= 20;
                JEmo.setLocation(x,300);
            }
        });
    }
}

