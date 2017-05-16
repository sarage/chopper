package com.mygdx.game.sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g3d.environment.AmbientCubemap;
import com.badlogic.gdx.graphics.g3d.utils.shapebuilders.ArrowShapeBuilder;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;

import java.util.Vector;

/**
 * Created by aizhan on 3/24/17.
 */

public class Hero {
    private Vector3 position;
    private static final int WALL = 0;
    private Vector3 velosity;
    private Texture texture;
    private Animation heroAnimation;



    public Hero(int x, int y){
        position = new Vector3(x,y,0);
        velosity = new Vector3(0,0,0);
        texture = new Texture("left_go.png");
        heroAnimation = new Animation(new TextureRegion(texture), 6, 1f);
    }

    public Vector3 getPosition() {
        return position;
    }

    public TextureRegion getHero() {
        return heroAnimation.getFrame();
    }

    public static int getWALL() {
        return WALL;
    }

    public Texture getTexture() {
        return texture;
    }

    public void update(float dt){
        velosity.add(WALL,0,0);
        velosity.scl(dt);
        position.add(velosity.x,0,0);
        heroAnimation.updates(dt);
    }

    public void Walking(){
        velosity.x=1920;
    }

    public void dispose(){
        texture.dispose();
    }
}
