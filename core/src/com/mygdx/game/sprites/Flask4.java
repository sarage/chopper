package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by student on 5/16/2017.
 */

public class Flask4 {
    private Vector3 position;
    private Texture texture;
    private Animation flask4Animation;



    public Flask4(int x, int y){
        position = new Vector3(x,y,0);
        texture = new Texture("flask3.png");
        flask4Animation = new Animation(new TextureRegion(texture), 3, 1f);
    }

    public Vector3 getPosition() {
        return position;
    }

    public TextureRegion getFlask4() {
        return flask4Animation.getFrame();
    }

    public Texture getTexture() {
        return texture;
    }

    public void update(float dt){
        flask4Animation.updates(dt);
    }

    public void dispose(){
        texture.dispose();
    }
}
