package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.sprites.Flasks;
import com.mygdx.game.sprites.Hero;

/**
 * Created by aizhan on 3/24/17.
 */

public class PlayState extends State{

    private Hero hero;
    private Texture background;
    private GameStateManagment gsm;
    private Flasks flask1;
    private Flasks flask2;
    private Flasks flask3;
    private Flasks flask4;


    public PlayState(GameStateManagment gsm) {
        super(gsm);
        camera.setToOrtho(false, MyGdxGame.WIDTH,MyGdxGame.HEIGHT);
        hero = new Hero(0,10);
        flask1 = new Flasks("flask2.png", 270,195);
        flask2 = new Flasks("flask1.png",283,330);
        flask3 = new Flasks("flask4.png",630,450);
        flask4 = new Flasks("flask3.png",500,100);
        background = new Texture("wall.png");
    }

    @Override
    protected void handleInput() {
        if (Gdx.input.justTouched()){
            hero.Walking();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
        hero.update(dt);
        flask1.update(dt);
        flask2.update(dt);
        flask3.update(dt);
        flask4.update(dt);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();
        sb.draw(background, 0,0, MyGdxGame.WIDTH+750, MyGdxGame.HEIGHT);
        sb.draw(flask1.getFlask(), flask1.getPosition().x,flask1.getPosition().y);
        sb.draw(flask2.getFlask(), flask2.getPosition().x,flask2.getPosition().y);
        sb.draw(flask3.getFlask(), flask3.getPosition().x,flask3.getPosition().y);
//        sb.draw(flask4.getFlask(), flask4.getPosition().x,flask4.getPosition().y);
        sb.draw(hero.getHero(),hero.getPosition().x,hero.getPosition().y);
        sb.end();
 }

    @Override
    public void dispose() {
    }
}
