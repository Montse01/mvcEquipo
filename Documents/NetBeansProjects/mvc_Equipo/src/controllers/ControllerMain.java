
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import views.ViewMain;

public class ControllerMain implements ActionListener{
   
    ViewMain viewMain;
   
    JPanel views[];
   

    public ControllerMain(ViewMain viewMain, JPanel []  views) {
   
        this.viewMain = viewMain;
        this.views = views;
        this.viewMain.jmi_volumen.addActionListener(this);
        this.viewMain.jmi_area.addActionListener(this);
        this.viewMain.jmi_perimetro.addActionListener(this);
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewMain.jmi_volumen)
            jmi_volumenActionPerformed();
        else if(e.getSource() == viewMain.jmi_area)
            jmi_areaActionPerformed();
        else if(e.getSource() == viewMain.jmi_perimetro)
            jmi_perimetroActionPerformed();
        
    }

    public void jmi_volumenActionPerformed(){
        this.viewMain.setContentPane(views [0]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
    public void jmi_areaActionPerformed(){
        this.viewMain.setContentPane(views [1]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
     
    private void initView(){
        this.viewMain.setTitle("Figuras");
        this.viewMain.setLocationRelativeTo(null);
        this.viewMain.setVisible(true);
    }

    private void jmi_perimetroActionPerformed() {
        this.viewMain.setContentPane(views [2]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
}
