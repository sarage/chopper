package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.sprites.Flask1;
import com.mygdx.game.sprites.Flask2;
import com.mygdx.game.sprites.Flask3;
import com.mygdx.game.sprites.Flask4;
import com.mygdx.game.sprites.Hero;

/**
 * Created by aizhan on 3/24/17.
 */

public class PlayState extends State{

    private Hero hero;
    private Texture background;
    private GameStateManagment gsm;
    private Flask1 flask1;
    private Flask2 flask2;
    private Flask3 flask3;
    private Flask4 flask4;

    public PlayState(GameStateManagment gsm) {
        super(gsm);
        camera.setToOrtho(false, MyGdxGame.WIDTH,MyGdxGame.HEIGHT);
        hero = new Hero(0,10);
        flask1 = new Flask1(270,210);
        flask2 = new Flask2(500,300);
        flask3 = new Flask3(500,500);
        flask4 = new Flask4(500,100);
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
        sb.draw(flask1.getFlask1(), flask1.getPosition().x,flask1.getPosition().y);
        sb.draw(flask2.getFlask2(), flask2.getPosition().x,flask2.getPosition().y);
        sb.draw(flask3.getFlask3(), flask3.getPosition().x,flask3.getPosition().y);
        sb.draw(flask4.getFlask4(), flask4.getPosition().x,flask4.getPosition().y);
        sb.draw(hero.getHero(),hero.getPosition().x,hero.getPosition().y);
        sb.end();
 }

    @Override
    public void dispose() {
    }
}
