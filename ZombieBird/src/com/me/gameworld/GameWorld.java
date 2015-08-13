package com.me.gameworld;

import com.me.gameobjects.Bird;
import com.me.gameobjects.ScrollHandler;
import com.me.zbhelpers.AssetLoader;

public class GameWorld {
	
	
	private Bird bird;
	private ScrollHandler scroller;
	
	private boolean isAlive = true;
	
	public GameWorld(int midPointY) {
		bird = new Bird(33, midPointY - 5, 17, 12);
		scroller = new ScrollHandler(midPointY  + 66);
	}
	
	public void update(float delta) {
		bird.update(delta);
		scroller.update(delta);
		
		if(isAlive && scroller.collides(bird)) {
			scroller.stop();
			AssetLoader.dead.play();
			isAlive = false;
		}
	}
	
	public Bird getBird() {
		return bird;
	}
	
	public ScrollHandler getScroller() {
		return scroller;
	}

}
