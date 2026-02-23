package zeldaminiclone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {

	public static BufferedImage spritesheet;
	
	public static BufferedImage worldtiles;
	
	public static BufferedImage[] player_front;
	
	public static BufferedImage[] player_side;
	
	public static BufferedImage[] player_back;
	
	public static BufferedImage walltile;
	
	public Spritesheet() {
		try {
			spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
			
			worldtiles = ImageIO.read(getClass().getResource("/overworldtiles.png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		player_front = new BufferedImage[2];
		player_front[0] = Spritesheet.getSprite(0, 11, 16, 16);
		player_front[1] = Spritesheet.getSprite(18, 11, 16, 16);
		
		player_side = new BufferedImage[2];
		player_side[0] = Spritesheet.getSprite(35, 11, 16, 16);
		player_side[1] = Spritesheet.getSprite(52, 11, 16, 16);
		
		player_back = new BufferedImage[2];
		player_back[0] = Spritesheet.getSprite(69, 11, 16, 16);
		player_back[1] = Spritesheet.getSprite(86, 11, 16, 16);
		
		walltile = Spritesheet.getSprite1(18, 52, 16, 16);
	}
	
	public static BufferedImage getSprite(int x, int y, int width, int height) {
		return spritesheet.getSubimage(x, y, width, height);
	}
	
	public static BufferedImage getSprite1(int x, int y, int width, int height) {
		return worldtiles.getSubimage(x, y, width, height);
	}
	
}
