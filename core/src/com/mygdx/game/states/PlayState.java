package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.sprites.Flasks;
import com.mygdx.game.sprites.Hero;
import com.sun.org.apache.bcel.internal.Constants;

import javax.swing.text.View;

import sun.net.www.http.Hurryable;

/**
 * Created by aizhan on 3/24/17.
 */

public class PlayState extends State{

    private Hero hero;
    private Texture background;

    private OrthographicCamera gamecam;
    private Viewport gamePort;

    private TmxMapLoader mapLoader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;

    //ParallaxBackground background;
    private GameStateManagment gsm;
    private Flasks flask1;
    private Flasks flask2;
    private Flasks flask3;
    private Flasks flask4;

    public PlayState(GameStateManagment gsm) {
        super(gsm);
        camera.setToOrtho(false, MyGdxGame.WIDTH,MyGdxGame.HEIGHT);
        hero = new Hero(0,0);
        flask1 = new Flasks("flask2.png", 270,195);
        flask2 = new Flasks("flask1.png",283,330);
        flask3 = new Flasks("flask4.png",630,450);
        flask4 = new Flasks("flask3.png",500,100);
        /*background = new ParallaxBackground(new ParallaxLayer[]{
                new ParallaxLayer(new TextureRegion(new Texture("wall1.png")), new Vector2(1, 1), new Vector2(0, 0)),
                new ParallaxLayer(new TextureRegion(new Texture("wall2.png")), new Vector2(1, 1), new Vector2(0, 0)),
        }, 2000, 500, new Vector2(50, 0));*/
        background = new Texture("wall.png");

        mapLoader = new TmxMapLoader();
        map = mapLoader.load("wall.png");
        renderer = new OrthogonalTiledMapRenderer(map);
        gamecam.position.set(gamePort.getScreenWidth()/2,gamePort.getScreenHeight()/2,0);
        
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
        //background.render(dt);
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
         //sb.draw(flask4.getFlask(), flask4.getPosition().x,flask4.getPosition().y);
        sb.draw(hero.getHero(),hero.getPosition().x,hero.getPosition().y);
        sb.end();
 }

    @Override
    public void dispose() {
    }
}
