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

    public MenuState(GameStateManagment gsm) {
        super(gsm);
        background = new Texture("wall.jpg");
        playBtn = new Texture("playbtn.png");
        contBtn = new Texture("contbtn.jpg");
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
        sb.draw(playBtn, (MyGdxGame.WIDTH/2)-(playBtn.getWidth()/2), MyGdxGame.HEIGHT/2);
        sb.draw(contBtn, (MyGdxGame.WIDTH/2)-(contBtn.getWidth()/2), MyGdxGame.HEIGHT/3);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
        contBtn.dispose();
    }
}
