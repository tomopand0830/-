
public class fire extends Enemy{
	public void draw(MyFrame f) {
	f.setColor(255, 255, 0);
	f.fillRect(x + 4, y + 4, 4, 4);

	// 内側の炎（オレンジ）
	f.setColor(255, 140, 0);
	f.fillRect(x + 3, y + 3, 6, 2);
	f.fillRect(x + 3, y + 6, 6, 2);

	// 外側の炎（赤）
	f.setColor(255, 0, 0);
	f.fillRect(x + 2, y + 2, 2, 2);
	f.fillRect(x + 6, y + 2, 2, 2);
	f.fillRect(x + 2, y + 6, 2, 2);
	f.fillRect(x + 6, y + 6, 2, 2);
	f.fillRect(x + 4, y + 1, 2, 2); // 上炎
	f.fillRect(x + 4, y + 8, 2, 2); 
	}// 下炎
	public fire(double x, double y, double vx, double vy) {
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
