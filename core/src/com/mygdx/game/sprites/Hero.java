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
    private String state="stay.png";
    private int statediv=3;

    public Hero(int x, int y){
            position = new Vector3(x, y, 0);
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

    public void setPosition(Vector3 position) {
        this.position = position;
    }

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public Animation getHeroAnimation() {
        return heroAnimation;
    }

    public void setHeroAnimation(Animation heroAnimation) {
        this.heroAnimation = heroAnimation;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getStatediv() {
        return statediv;
    }

    public void setStatediv(int statediv) {
        this.statediv = statediv;
    }
}
