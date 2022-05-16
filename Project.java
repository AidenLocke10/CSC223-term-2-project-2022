
/**
 * Write a description of class Project here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Project
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Project
     */
    public Project()
    {
        // initialise instance variables
        int grid[][] = new int [25][25]; // creating grid using 2d array
        for (int x=0;x<25;x++){
            for(int y=0;y<25;y++){
                //grid[x][y] =y+1;
                System.out.print(grid[x][y]+" ");
            }
            System.out.print("\n");
        }
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
