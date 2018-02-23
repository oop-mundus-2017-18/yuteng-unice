package model.world;

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
    // Row and column positions.
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
}