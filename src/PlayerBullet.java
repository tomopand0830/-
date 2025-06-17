
public class PlayerBullet extends Character
{
	public void draw(MyFrame f) 
{
	f.setColor(0, 128, 0);
	f.fillOval(x+5, y, 20, 20);
	
}
	
public PlayerBullet(double x,double y,double vx,double vy) 
{
	super(x,y,vx,vy);
	//super(x,y,vx+20,vy);//弾の弾道が斜め
}
}
