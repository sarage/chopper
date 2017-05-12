package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.sprites.Hero;

/**
 * Created by aizhan on 3/24/17.
 */

public class PlayState extends State{

    private Hero hero;
    private Texture background;

    public PlayState(GameStateManagment gsm) {
        super(gsm);
        camera.setToOrtho(false, MyGdxGame.WIDTH,MyGdxGame.HEIGHT);
        hero = new Hero(0,10);
        background = new Texture("wall.png");
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
        sb.draw(background, 0,0, MyGdxGame.WIDTH+750, MyGdxGame.HEIGHT);
        sb.draw(hero.getHero(),hero.getPosition().x,hero.getPosition().y);
        sb.end();

        /*if (Gdx.input.isTouched()){
            Vector3 touch_pos = new Vector3();
            touch_pos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            camera.unproject(touch_pos);
        }*/
 }

    @Override
    public void dispose() {

    }
}
