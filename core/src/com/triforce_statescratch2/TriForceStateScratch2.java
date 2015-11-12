package com.triforce_statescratch2;

import com.badlogic.gdx.Game;
import com.triforce_statescratch2.States.MainMenuState;
import com.triforce_statescratch2.States.PlayState;

public class TriForceStateScratch2 extends Game { //https://code.google.com/p/libgdx-users/wiki/ScreenAndGameClasses

	MainMenuState mainMenuState; //Instances of the other classes to call.
	PlayState playState;

	@Override
	public void create () {

		mainMenuState = new MainMenuState(this);
		playState = new PlayState(this);

		setScreen(mainMenuState);
	}

	//If you include this render, it will display whatever is here, and not the render in the other classes.
	//@Override
	//public void render () {
	//Gdx.gl.glClearColor(1, 0, 0, 1);
	//Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	//}
}
