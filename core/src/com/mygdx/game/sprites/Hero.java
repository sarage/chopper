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
    private Texture texture;
    private Animation heroAnimation;
    private String state="right_go.png";
    private int statediv=6;

    public Hero(int x, int y){
        position = new Vector3(x,y,0);
        texture = new Texture(state);
        heroAnimation = new Animation(new TextureRegion(texture), statediv, 1f);
    }

    public Vector3 getPosition() {
        return position;
    }

    public TextureRegion getHero() {
        return heroAnimation.getFrame();
    }

    public void update(float dt){
        heroAnimation.updates(dt);
    }

    public void dispose(){
        texture.dispose();
    }
}
