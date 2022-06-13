// all imports below are for graphics (until next comment)
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
// the imports below are for the mouse listener(until next comment)
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 * @author Aiden Locke
 * version 1 
 * start date (11/05/2022)
 */
public class CSCproject2022 extends JPanel  {

    /**
     * constructor for objects of class CSCproject2022
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //g.setColor(Color.BLACK);
        //g.drawLine(100,100,400,100);
        int x1=0; //distance from the left side top of line 
        int y1=0; //distance from top of canvas top of line 
        int x2=400; // distance from left side bottom of line
        int y2=400; // distance from top of canvas bottom of line

        for(int x=0; x<400; x=x+20){
            // loop for making horizantal lines
            g.setColor(Color.BLACK); // setting color of line
            g.drawLine(x,y1,x,y2); // drawing line
        }

        for(int y=0;y<400;y=y+20){ //loop for makinf vertical lines
            g.setColor(Color.BLACK); 
            g.drawLine(x1,y,x2,y);
        }

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
                frame.getContentPane().addMouseListener(new MouseListener(){
                        // these are the different steps in clicking the mouse 
                        @Override
                        public void mouseClicked(MouseEvent e){
                            int i=0;
                            int gridPos[][][]= new int[20][20][3];

                            for (int x=0; x<20; x++){
                                for (int y=0; y<20; y++){
                                    if (e.getX()<gridPos[x][y][0] && e.getY()<gridPos[x][y][1]){
                                        gridPos[x][y][2]=i;
                                        i=i+1;
                                        gridPos[x][y][0]= (x*20)+20;
                                        gridPos[x][y][1]= (y*20)+20;
                                    }
                                }
                            }
                            System.out.println(e.getPoint());
                        }

                        @Override
                        public void mouseEntered(MouseEvent e){

                        }

                        @Override
                        public void mouseExited(MouseEvent e){

                        }

                        @Override
                        public void mousePressed(MouseEvent e){

                        }

                        @Override
                        public void mouseReleased(MouseEvent e){
                            
                        }
                    });
            });

    }
}
