package com.me.ZombieBird;

import com.badlogic.gdx.Game;
import com.me.screens.GameScreen;
import com.me.zbhelpers.AssetLoader;


public class ZBGame extends Game {

	@Override
	public void create() {
		System.out.println("ZBGame Created!");
		AssetLoader.load();
		setScreen(new GameScreen());
	}
	
	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
	
}
