package de.poyraz.mztabviewer;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelTable extends JPanel{
    DummyData d = new DummyData();
    Graphics2D g2;
   
   public void paint(Graphics g) {
	  set_dummy_data();
      g2 = (Graphics2D)g;
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
      RenderingHints.VALUE_ANTIALIAS_ON);
      Font font = new Font("Courier", Font.PLAIN, 14);
      //FontMyetrics metrics = g2.getFontMetrics(font);
      //System.out.println(metrics.getHeight());
      //g2.drawLine(x1, y1, x2, y2);

      drawTitle(d.getTitle());
  	  g2.setFont(font);
      drawDescription(d.getDescription());
      drawTable();
      draw_m_calc();
      draw_peptide(d.getPeptide_calc());
      drawcharge(d.getCharge());
   }
   
   
      
   private void drawcharge(String charge) {
	   g2.drawString("z="+charge, 320, 100);	
   }



private void draw_peptide(String peptide) {
	   g2.drawString("peptide", 220, 100);
	   g2.drawString(peptide, 220, 130);
   }



private void draw_m_calc() {
	   g2.drawString("m(calc)", 120, 110);	
   }



private void drawTable() {
	   g2.drawLine(100, 80, 900, 80);
	   g2.drawLine(700, 80, 700, 120);
   }



private void drawDescription(String description) {
	   g2.drawString(description, 350, 70);	
   }



private void drawTitle(String title) {
	   setTitleFont();
	   g2.drawString(title, 350, 50);
   }
   


private void setTitleFont() {
    Font font = new Font("Helvetica", Font.PLAIN, 42);
	g2.setFont(font);
}



public static void main(String[] args) {
      JFrame f = new JFrame();
      f.getContentPane().add(new PanelTable());
      f.setSize(1000, 200);
      f.setVisible(true);
   }
   
   private void set_dummy_data(){
	   d.setTitle("IFVGGLNPEATEEK");
	   d.setDescription("Heterogeneous nuclear ribonucleoprotein A/B (Q99729)");
	   d.setBegin_end("I156-K169");
	   d.setPeptide_calc("826.9");
	   d.setPeptide_z("914.4065");
	   d.setCharge("2");
	   d.setMz_exp("914.4047");
	   d.setDelta_m("2.00 ppm");
	  
   }
   
}