package com.mygdx.game.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.sprites.Hero;

/**
 * Created by aizhan on 3/24/17.
 */

public class PlayState extends State{

    private Hero hero;

    public PlayState(GameStateManagment gsm) {
        super(gsm);
        hero = new Hero(50,300);
        camera.setToOrtho(false, MyGdxGame.WIDTH/2,MyGdxGame.HEIGHT/2);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {
        hero.update(dt);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();
        sb.draw(hero.getHero(),hero.getPosition().x,hero.getPosition().y);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
