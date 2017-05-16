package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector3;

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
        texture = new Texture("stay.png");
        heroAnimation = new Animation(new TextureRegion(texture), 3, 1f);
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
        if (position.x>0)
            velosity.add(WALL,0,0);
        velosity.scl(dt);
        position.add(velosity.x,0,0);
        if (position.x>1700)
            position.x=1700;
        heroAnimation.updates(dt);
    }

    public void Walking(){
        velosity.x=1920;
    }

    public void dispose(){
        texture.dispose();
    }
}
