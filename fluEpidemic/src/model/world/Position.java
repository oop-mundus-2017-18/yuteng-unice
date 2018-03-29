package model.world;

import java.util.Random;

import static model.world.World.WORLDSIZE;

/**
 * @Project: fluEpidemic
 * @Author: YU Teng
 * @Description:
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: University of Nice
 */
public class Position
{
    private int row;
    private int col;

    public Position(int row, int col)
    {
        this.row = row;
        this.col = col;
    }
    //is equals
    public boolean equals(Object obj)
    {
        if(obj instanceof Position) {
            Position other = (Position) obj;
            return row == other.getRow() && col == other.getCol();
        }
        else {
            return false;
        }
    }

    public String toString()
    {
        return "[" + row + "," + col + "]";
    }

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }

    //9 direction move: 0 not change,1 row,2 col
    public Position changePosition() {
        Random random = new Random();
        int r = random.nextInt(3);
        if (r == 1) {
            //0 not change ,1 add ,2 min
            if (random.nextInt(3)==1 && row + 1 < WORLDSIZE){
                row++;
            } else if (random.nextInt(3) == 2 && row - 1 >= 0) {
                row--;
            }
        } else if (r == 2 && col + 1 < WORLDSIZE) {
            //0 not change ,1 add ,2 min
            if (random.nextInt(3)==1 && col + 1 < WORLDSIZE){
                col++;
            } else if (random.nextInt(3) == 2 && col - 1 >= 0) {
                col--;
            }
        }
        return this;
    }
}