package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by student on 5/16/2017.
 */

public class Flask2 {
    private Vector3 position;
    private Texture texture;
    private Animation flask2Animation;



    public Flask2(int x, int y){
        position = new Vector3(x,y,0);
        texture = new Texture("flask3.png");
        flask2Animation = new Animation(new TextureRegion(texture), 3, 1f);
    }

    public Vector3 getPosition() {
        return position;
    }

    public TextureRegion getFlask2() {
        return flask2Animation.getFrame();
    }

    public Texture getTexture() {
        return texture;
    }

    public void update(float dt){
        flask2Animation.updates(dt);
    }

    public void dispose(){
        texture.dispose();
    }
}
