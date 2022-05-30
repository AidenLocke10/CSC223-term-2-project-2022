// all imports below are for graphics (until next comment)
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * @author Aiden Locke
 * version 1 
 * start date (11/05/2022)
 */
 public class CSCproject2022 extends JPanel  {
     
     
/**
    * constructor for objects of class CSCproject2022
    */
   public CSCproject2022()
   {
      //initialise instance variables  
       
       
    }

    /**
     * 
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var panel = new CSCproject2022();
            panel.setBackground(Color.WHITE); //setting the cavas color
            var frame = new JFrame("Conway's game of life");
            frame.setSize(400, 400);  //setting the size of the canvas
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.setVisible(true);
           
});
}
}
