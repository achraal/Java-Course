package jc.entities;

public class Horse
{
    public Horse(String name)
    {
        this.mName = name;
        this.mPosX = 50;
        this.mPosY = 50;
    }

    public void move(int x, int y)
    {
        this.mPosX = x;
        this.mPosY = y;
        System.out.println("Le Cheval se déplace X = " + this.mPosX + ", Y = " + this.mPosY + ")");
    }

    private String mName;
    private int mPosX;
    private int mPosY;
}