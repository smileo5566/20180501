import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton Jbt1 = new JButton("Run");
    private JButton Jbt2 = new JButton("RE");
    private JButton Jbt3 = new JButton("Exit");
    private Container cp;
    private JButton Jbtn [] [] = new JButton [3] [3];
    private JPanel Jpnc = new JPanel();
    private JPanel JpnR = new JPanel(new GridLayout(3,1,3,3));
    private boolean flag = true;
    public MainFrame(){
        init();
    }
    public void init(){
        this.setBounds(100,100,600,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        cp.add(Jpnc, BorderLayout.CENTER);
        cp.add(JpnR, BorderLayout.EAST);
        Jpnc.setLayout(new GridLayout(3,3,3,3));
        JpnR.add(Jbt1);
        JpnR.add(Jbt2);
        JpnR.add(Jbt3);
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                Jbtn[i][j] = new JButton();
                Jpnc.add(Jbtn[i][j]);
                Jbtn [i][j].setBackground(new Color(1));
                Jbtn [i][j] .setFont(new Font(null, Font.BOLD, 100));
                Jbtn [i][j] .setEnabled(false);
                Jbtn [i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton tmpBtn = (JButton) e.getSource() ;
                        if (tmpBtn.getText().equals("")) {
                            if (flag){
                                tmpBtn.setText("O");
                                tmpBtn.setBackground(new Color(255,255,255));
                            }else{
                                tmpBtn.setText("X");
                                tmpBtn.setBackground(new Color(255,255,255));
                            }
                            flag = !flag;
                            checkStat();
                        }

                    }
                });

            }
        }
        Jbt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3 ; j++){
                        Jbtn[i][j].setEnabled(true);
                    }
                }
            }

        });
        Jbt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 3; i++){
                    for (int j = 0; j < 3; j++){
                        Jbtn[i][j].setText("");
                        Jbtn [i][j].setBackground(new Color(1));
                    }
                }

            }
        });
        Jbt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    private void checkStat(){
        if(Jbtn[0][0].getText().equals(Jbtn[0][1].getText()) && Jbtn[0][0].getText().equals(Jbtn[0][2].getText()) && Jbtn [0][0].getText()!= ""){
            JOptionPane.showMessageDialog(MainFrame.this, "Win");
        }
        if(Jbtn[1][0].getText().equals(Jbtn[1][1].getText()) && Jbtn[1][0].getText().equals(Jbtn[1][2].getText()) && Jbtn [1][0].getText()!= ""){
            JOptionPane.showMessageDialog(MainFrame.this, "Win");
        }
        if(Jbtn[2][0].getText().equals(Jbtn[2][1].getText()) && Jbtn[2][0].getText().equals(Jbtn[2][2].getText()) && Jbtn [2][0].getText()!= ""){
            JOptionPane.showMessageDialog(MainFrame.this, "Win");
        }
        if(Jbtn[0][2].getText().equals(Jbtn[1][2].getText()) && Jbtn[0][2].getText().equals(Jbtn[2][2].getText()) && Jbtn [0][2].getText()!= ""){
            JOptionPane.showMessageDialog(MainFrame.this, "Win");
        }
        if(Jbtn[0][0].getText().equals(Jbtn[1][0].getText()) && Jbtn[0][0].getText().equals(Jbtn[2][0].getText()) && Jbtn [0][0].getText()!= ""){
            JOptionPane.showMessageDialog(MainFrame.this, "Win");
        }
        if(Jbtn[0][1].getText().equals(Jbtn[1][1].getText()) && Jbtn[0][1].getText().equals(Jbtn[1][2].getText()) && Jbtn [0][1].getText()!= ""){
            JOptionPane.showMessageDialog(MainFrame.this, "Win");
        }
        if(Jbtn[0][0].getText().equals(Jbtn[1][1].getText()) && Jbtn[0][0].getText().equals(Jbtn[2][2].getText()) && Jbtn [0][0].getText()!= ""){
            JOptionPane.showMessageDialog(MainFrame.this, "Win");
        }
        if(Jbtn[2][0].getText().equals(Jbtn[1][1].getText()) && Jbtn[1][1].getText().equals(Jbtn[0][2].getText()) && Jbtn [2][0].getText()!= ""){
            JOptionPane.showMessageDialog(MainFrame.this, "Win");
        }
    }
}


