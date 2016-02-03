package de.poyraz.mztabviewer;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	
   Graphics2D g2;
   int startXPos;
   int startYPos;
   int charWidth;
   
   public void paint(Graphics g) {
      g2 = (Graphics2D)g;
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
      RenderingHints.VALUE_ANTIALIAS_ON);
      Font font = new Font("Courier", Font.PLAIN, 92);
      FontMetrics metrics = g2.getFontMetrics(font);
      System.out.println(metrics.getHeight());
      charWidth = metrics.charWidth('A');
      g2.setFont(font);
      startXPos = 40 ;
      startYPos = 120 ;
      g2.drawString("IFVGGLNPEATEEK",startXPos , startYPos);
      //g2.drawLine(x1, y1, x2, y2);
      drawTopAnnotation("a2*", 3);
      drawTopAnnotation("a5", 5);
      drawBottomAnnotation("y6", 6);
      drawBottomAnnotation("y8", 8);

   }
   
   
   public void drawTopAnnotation(String text, int position){
	      Font font = new Font("Courier", Font.PLAIN, 24);
	      g2.setFont(font);
	      g2.drawLine(startXPos+position*charWidth, startYPos-(charWidth+10), startXPos+ position*charWidth, startYPos+20);
	      g2.drawLine(startXPos+position*charWidth, startYPos-(charWidth+10), startXPos+(position-1)*charWidth , startYPos-(charWidth+10));
	      g2.drawString(text, startXPos+((position-1)*charWidth), charWidth-10);
   }
   
   public void drawBottomAnnotation(String text, int position){
	      Font font = new Font("Courier", Font.PLAIN, 24);
	      g2.setFont(font);
	      g2.drawLine(startXPos+position*charWidth, startYPos-(charWidth+10), startXPos+ position*charWidth, startYPos+20);
	      g2.drawLine(startXPos+position*charWidth, startYPos+20, startXPos+(position+1)*charWidth , startYPos+20);
	      g2.drawString(text, startXPos+((position)*charWidth), charWidth+100);
}
   
   
   public static void main(String[] args) {
      JFrame f = new JFrame();
      f.getContentPane().add(new MyPanel());
      f.setSize(1000, 200);
      f.setVisible(true);
   }
}