package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
<<<<<<< HEAD
import com.badlogic.gdx.graphics.Texture;
=======
>>>>>>> 3255a3d3463f2dfa2a9e4295baacc919d714b16f
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.states.GameStateManagment;
import com.mygdx.game.states.MenuState;

public class MyGdxGame extends ApplicationAdapter {
	public static final int WIDTH = 1920;
	public static final int HEIGHT = 1080;

<<<<<<< HEAD
=======

>>>>>>> 3255a3d3463f2dfa2a9e4295baacc919d714b16f
	public static final String TITLE = "Chopper";

    private GameStateManagment gsm;
	private SpriteBatch batch;

    private Music music;

	@Override
	public void create () {
		batch = new SpriteBatch();
        gsm = new GameStateManagment();
        music = Gdx.audio.newMusic(Gdx.files.internal("music.mp3"));
        music.setLooping(true);
        music.setVolume(0.2f);
        music.play();
        Gdx.gl.glClearColor(1, 0, 0, 1);
        gsm.push(new MenuState(gsm));
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        gsm.update(Gdx.graphics.getDeltaTime());
        gsm.render(batch);
	}

	@Override
    public void dispose(){
        super.dispose();
        music.dispose();

    }
}
