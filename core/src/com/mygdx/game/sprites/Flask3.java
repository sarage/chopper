package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by student on 5/16/2017.
 */

public class Flask3 {
    private Vector3 position;
    private Texture texture;
    private Animation flask3Animation;



    public Flask3(int x, int y){
        position = new Vector3(x,y,0);
        texture = new Texture("flask4.png");
        flask3Animation = new Animation(new TextureRegion(texture), 3, 1f);
    }

    public Vector3 getPosition() {
        return position;
    }

    public TextureRegion getFlask3() {
        return flask3Animation.getFrame();
    }

    public Texture getTexture() {
        return texture;
    }

    public void update(float dt){
        flask3Animation.updates(dt);
    }

    public void dispose(){
        texture.dispose();
    }
}
