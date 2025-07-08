import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Player extends Character implements KeyListener
{
	public void draw(MyFrame f) 
	{
		f.setColor(0, 128, 0);
		f.fillRect(x, y+20, 30, 10);
		f.setColor(200,200,200);
		f.fillRect(x+10, y, 10, 30);
	}

	public Player(double x,double y,double vx,double vy) 
	{
		super(x,y,vx,vy);
	}
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode()==KeyEvent.VK_LEFT) 
		{
		vx =-5;	
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) 
		{
		vx =5;	
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) 
		{
		vy =-2;	
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) 
		{
		vy =2;	
		}
		
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			// 弾の発射位置と数をスコアに応じて変化
			if (GameWorld.score >= 100) {
				// 5発（拡散型）
				GameWorld.playerBullets.add(new PlayerBullet(x - 20, y, 0, -10));
				GameWorld.playerBullets.add(new PlayerBullet(x - 10, y, -2, -10));
				GameWorld.playerBullets.add(new PlayerBullet(x, y, 0, -10));
				GameWorld.playerBullets.add(new PlayerBullet(x + 10, y, 2, -10));
				GameWorld.playerBullets.add(new PlayerBullet(x + 20, y, 0, -10));
			} else if (GameWorld.score >= 50) {
				// 3発（左右+中央）
				GameWorld.playerBullets.add(new PlayerBullet(x - 10, y, 0, -10));
				GameWorld.playerBullets.add(new PlayerBullet(x, y, 0, -10));
				GameWorld.playerBullets.add(new PlayerBullet(x + 10, y, 0, -10));
			} else if (GameWorld.score >= 10) {
				// 2発（左右）
				GameWorld.playerBullets.add(new PlayerBullet(x - 10, y, 0, -10));
				GameWorld.playerBullets.add(new PlayerBullet(x + 10, y, 0, -10));
			} else {
				// 1発（中央）
				GameWorld.playerBullets.add(new PlayerBullet(x, y, 0, -10));
			}
			System.out.println("弾の数" + GameWorld.playerBullets.size());
		}
		if(e.getKeyCode()==KeyEvent.VK_ENTER) 
		{
			System.out.println("Enterキーが押されました");
			GameWorld.enterPressed =true;
		}
		/*if(e.getKeyCode()==KeyEvent.VK_SPACE) 
		{
		GameWorld.playerBullets.add(new PlayerBullet(x,y,0,-10));
		System.out.println("弾の数"+GameWorld.playerBullets.size());
		}*/
		/*if(e.getKeyCode() == KeyEvent.VK_V) {
			if (GameWorld.score >= 10) {
				GameWorld.playerBullets.add(new PlayerBullet(x + 10, y, 0, -10));
			} else {
				System.out.println("スコアが足りません！（10必要）");
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_C) {
			if (GameWorld.score >= 50) {
				GameWorld.playerBullets.add(new PlayerBullet(x - 10, y, 0, -10));        
			} else {
				System.out.println("スコアが足りません！（50必要）");
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_B) {
			if (GameWorld.score >= 100) {
				GameWorld.playerBullets.add(new PlayerBullet(x - 20, y, 0, -10));        
			} else {
				System.out.println("スコアが足りません！（100必要）");
			}
		}*/
	}
	public void keyReleased(KeyEvent e) 
	{
		if(e.getKeyCode()==KeyEvent.VK_LEFT) 
		{
		vx =0;	
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) 
		{
		vx =0;	
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) 
		{
		vy =0;	
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) 
		{
		vy =0;	
		}
	}
	public void keyTyped(KeyEvent e) {}
	public void move() 
	{
		super.move();
		if(x<0)
			x=0;
		if(x>370)
			x=370;
	}
	
}
