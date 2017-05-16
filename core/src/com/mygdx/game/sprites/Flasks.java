package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by student on 5/16/2017.
 */

public class Flasks {

    private Vector3 position;
    private Texture texture;
    private Animation flaskAnimation;
    private Rectangle bound;


    public Flasks(String st, int x, int y){
        position = new Vector3(x,y,0);
        texture = new Texture(st);
        flaskAnimation = new Animation(new TextureRegion(texture), 3, 1f);
        bound = new Rectangle(x, y, texture.getWidth(), texture.getHeight());
    }

    public Vector3 getPosition() {
        return position;
    }

    public boolean collite (Rectangle hero){
        return hero.overlaps(bound);
    }

    public TextureRegion getFlask() {
        return flaskAnimation.getFrame();
    }

    public Texture getTexture() {
        return texture;
    }

    public void update(float dt){
        flaskAnimation.updates(dt);
    }

    public void dispose(){
        texture.dispose();
    }

    public void remove(){
        this.remove();
    }
}
