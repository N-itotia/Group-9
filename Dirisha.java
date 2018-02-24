/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hokel
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Dirisha extends JFrame implements ActionListener{
    final static int a= 800;
    final static int b= 350;
    final static Dimension label=new Dimension(50,30);
    final static Dimension combo=new Dimension(50,30);
    final static Dimension text=new Dimension(50,30);
    JPanel moja=new JPanel();
    JPanel pili=new JPanel();
        JLabel moja1=new JLabel("Name");
            JTextField moja11=new JTextField(5);
        JLabel moja2=new JLabel("DOB");
            JTextField moja21=new JTextField(5);
        JLabel moja3=new JLabel("Age");
            JTextField moja31=new JTextField(5);
        JLabel pili1=new JLabel("Address");
            JTextField pili11=new JTextField(5);
        JLabel pili2=new JLabel("City");
            JTextField pili21=new JTextField(5);
        JLabel pili3=new JLabel("County");
            JTextField pili31=new JTextField(5);
        JLabel pili4=new JLabel("PhoneNo");
            JTextField pili41=new JTextField(5);
        JLabel pili5=new JLabel("Sex");
            JTextField pili51=new JTextField(5);
        JLabel pili6=new JLabel("NationalID");
            JTextField pili61=new JTextField(5);    
    JPanel tatu=new JPanel();
        JLabel tatu1=new JLabel("Statement");
            JTextArea tatu11=new JTextArea();
    JPanel nne =new JPanel();        
        JLabel nne1=new JLabel("Incident No");
            JTextField nne11=new JTextField(10);               
        JLabel nne2=new JLabel("First Reportted");
            JTextField nne21=new JTextField(10);
        JLabel nne3=new JLabel("Incident Status");
            JComboBox nne31=new JComboBox();
    JPanel tano=new JPanel();
        JLabel tano1=new JLabel("Officer In Charge:");
            JTextField tano11=new JTextField(10);
                JButton Save=new JButton("Save");
                JButton Exit=new JButton("Exit");
    JPanel nane=new JPanel();
        JLabel nane1=new JLabel("Case NO");
            JTextField nane11=new JTextField(5);
    JPanel sita=new JPanel();
    JPanel saba=new JPanel();
    JPanel tisa=new JPanel();
    JPanel kumi=new JPanel();
    JPanel kumi2=new JPanel();
    
        
        public Dirisha(){
           
            
           
              
                    
            pili.setLayout(new GridLayout(3,2,1,1));
              pili.add(moja1);
                    pili.add(moja11);moja11.setPreferredSize(text);
                   moja11.addKeyListener(new KeyAdapter(){
                          @Override   
                          public void keyTyped(KeyEvent.VK_ENTER||event.getKeyCode()==KeyEvent.VK_ENTER){
                              edditor();                          }}
                   );                 
                            
                    
            pili.add(moja2);
                    pili.add(moja21);
                pili.add(moja3);
                     pili.add(moja31);
                pili.add(pili1);
                     pili.add(pili11);
                pili.add(pili2);
                     pili.add(pili21);
                pili.add(pili3);
                    pili.add(pili31);
                pili.add(pili4);
                    pili.add(pili41);
                pili.add(pili5);
                    pili.add(pili51);
                pili.add(pili6);
                    pili.add(pili61);
            tatu.setLayout(new GridLayout(2,1,1,1));
                tatu.add(tatu1,"North");
                    tatu.add(tatu11,"CENTER");
            nne.setLayout(new GridLayout(1,3,1,3));
                nne.add(nne1);
                     nne.add(nne11);
                nne.add(nne2);
                     nne.add(nne21);
                nne.add(nne3);                
                     nne.add(nne31); 
                     kumi2.setLayout(new FlowLayout());
                     kumi2.add(tano1);
                    kumi2.add(tano11);
   
            tano.setLayout(new FlowLayout());
             tano.add(kumi2);
              tano.add(Save);Save.addActionListener(this);
                tano.add(Exit);Exit.addActionListener(this);
            sita.setLayout(new GridLayout(2,1,0,0));
                    sita.add(pili);
                    sita.add(tatu);
            nane.setLayout(new FlowLayout());
                    nane.add(nane1);
                    nane.add(nane11);
            saba.setLayout(new BorderLayout());
                    saba.add(sita,BorderLayout.CENTER);
                    saba.add(tano,"South");
            kumi.setLayout(new BorderLayout());
                kumi.add(saba,BorderLayout.CENTER);
                kumi.add(nne,"North");
                
          
            tisa.setLayout(new BorderLayout());
                tisa.add(kumi,BorderLayout.CENTER);
                tisa.add(nane,"North");
                add(tisa);
                
            
        }
        @Override
        public void actionPerformed(ActionEvent event)
        {
            String s=event.getActionCommand();
            if(s.equals("Exit"))
            {
                int opt=JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","Confirm"
                        +"Exit",JOptionPane.YES_NO_OPTION);
                if(opt==0){
                    System.exit(0);
                }
           
                
            }
        }
        public void validateadd(){
            String name=moja11.getText().trim();
            String dob=moja21.getText().trim();
            String age=moja31.getText().trim();
            String address=moja11.getText().trim();
            String city=pili21.getText().trim();
            String phone_number=pili41.getText().trim();
            String county=pili31.getText().trim();
            String gender=pili51.getText().trim();
            String ID=pili61.getText().trim();
            
        }
        public static void main(String args[]){
            
      Dirisha dirisha1=new Dirisha();
             dirisha1.setSize(a,b);
            dirisha1.setLocationRelativeTo(null);
            dirisha1.setTitle("Admin Window");
            dirisha1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dirisha1.setVisible(true);
            dirisha1.setResizable(false);
        }   

   
    
    
}
