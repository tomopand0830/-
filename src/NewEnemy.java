
public class NewEnemy extends Enemy
{
	public void draw(MyFrame f) 
	{
		f.setColor(0, 0, 0);

	    f.fillRect(x, y, 30, 10);  
	  
	    f.fillRect(x + 25, y - 8, 4, 8); 
	    
	    f.fillRect(x + 24, y - 13, 6, 5); 
	  
	    f.fillRect(x - 10, y + 3, 10, 3); 
	  
	    f.fillRect(x + 5, y + 10, 4, 7); 
	    f.fillRect(x + 20, y + 10, 4, 7); 
	}

	
	public NewEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		life=1;
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void move() 
	{
		super.move();
		if(x<GameWorld.player.x) 
		{
			x++;
		}
		if(x>GameWorld.player.x) 
		{
			x--;
		}
	}
}
