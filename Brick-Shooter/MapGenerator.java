
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
    public int map[][];
    public int Brickwidth;
    public int Brickheight;
    public MapGenerator(int row, int col){
        map=new int[row][col];
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                map[i][j]=1;
            }
        }
        Brickheight=150/row;
        Brickwidth=540/col;
    }
    public void draw(Graphics2D g){
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                if(map[i][j]>0){
                    g.setColor(Color.white);
                    g.fillRect(j*Brickwidth+80, i*Brickheight+50, Brickwidth, Brickheight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j*Brickwidth+80, i*Brickheight+50, Brickwidth, Brickheight);
                }
            }
        }
    }
    public void setBrickValue(int value,int row, int col){
        map[row][col]=value;

    }

}
