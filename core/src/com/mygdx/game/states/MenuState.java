package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGdxGame;

/**
 * Created by aizhan on 3/24/17.
 */

public class MenuState extends State{

    private Texture background;
    private Texture playBtn;
    private Texture contBtn;
    private Texture soundBtn;
    private Texture quitBtn;

    public MenuState(GameStateManagment gsm) {
        super(gsm);
        background = new Texture("menu_back.png");
        playBtn = new Texture("playbtn.png");
        contBtn = new Texture("contbtn.png");
        soundBtn = new Texture("soundbtn_on.png");
        quitBtn = new Texture("quitbtn.png");
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0,0, MyGdxGame.WIDTH, MyGdxGame.HEIGHT);
        sb.draw(playBtn, (MyGdxGame.WIDTH/2)-(playBtn.getWidth()), (MyGdxGame.HEIGHT)-(playBtn.getHeight()+80));
        sb.draw(contBtn, (MyGdxGame.WIDTH/2)-(contBtn.getWidth()), (MyGdxGame.HEIGHT)-(contBtn.getHeight()+320));
        sb.draw(soundBtn, (MyGdxGame.WIDTH/2)-(soundBtn.getWidth()),(MyGdxGame.HEIGHT)-(soundBtn.getHeight()+550));
        sb.draw(quitBtn, (MyGdxGame.WIDTH/2)-(quitBtn.getWidth()), (MyGdxGame.HEIGHT)-(quitBtn.getHeight()+780));
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
        contBtn.dispose();
        soundBtn.dispose();
        quitBtn.dispose();
    }
}
