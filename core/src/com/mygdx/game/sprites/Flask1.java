package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by student on 5/16/2017.
 */

public class Flask1 {
    private Vector3 position;
    private Texture texture;
    private Animation flask1Animation;



    public Flask1(String st, int x, int y){
        position = new Vector3(x,y,0);
        texture = new Texture(st);
        flask1Animation = new Animation(new TextureRegion(texture), 3, 1f);
    }

    public Vector3 getPosition() {
        return position;
    }

    public TextureRegion getFlask1() {
        return flask1Animation.getFrame();
    }

    public Texture getTexture() {
        return texture;
    }

    public void update(float dt){
       flask1Animation.updates(dt);
    }

    public void dispose(){
        texture.dispose();
    }
}
