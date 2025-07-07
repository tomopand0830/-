
public class sinigami extends Enemy{

	public void draw(MyFrame f) 
	{
		f.setColor(0, 0, 0);
		f.fillRect(x + 6, y + 0, 16, 4);   
		f.fillRect(x + 4, y + 4, 20, 6);    
		f.fillRect(x + 5, y + 10, 18, 4);   
		f.setColor(160, 160, 160);
		f.fillRect(x + 8, y + 6, 12, 6);    
		f.fillRect(x + 10, y + 12, 4, 2);  
		f.setColor(0, 0, 0);
		f.fillRect(x + 10, y + 7, 2, 2);    
		f.fillRect(x + 14, y + 7, 2, 2);    
		f.fillRect(x + 12, y + 9, 1, 1);    
		f.setColor(0, 0, 0);
		f.fillRect(x + 7, y + 14, 14, 8);   
		f.fillRect(x + 6, y + 22, 4, 6);    
		f.fillRect(x + 16, y + 22, 4, 6);   
		f.setColor(60, 60, 60);
		f.fillRect(x + 2, y + 0, 2, 28);    
		f.setColor(220, 220, 220);
		f.fillRect(x - 2, y + 0, 4, 4);     
	}
	public sinigami(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		life=1;
		score=10;
		// TODO 自動生成されたコンストラクター・スタブ
}
	public void move() 
	{
	super.move();
	vy =vy+0.1*10;
	}
}
