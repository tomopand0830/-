
public class StraightEnemy extends Enemy{
	public void draw(MyFrame f) 
	{
		f.setColor(0, 0, 0);
		f.fillRect(x,y,10,15);
		f.setColor(0, 0, 0);
		f.fillRect(x-2,y-10,14,15);
		
		
	}
	public StraightEnemy(double x,double y,double vx,double vy) 
	{
		super(x,y,vx,vy);
	}

}
