package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

import java.util.Vector;

/**
 * Created by aizhan on 3/24/17.
 */

public class Hero {
    public static final int GRAVITY = -15;
    private Vector3 position;
    private Vector3 velosity;

    private Texture hero;

    public Hero(int x, int y){
        position = new Vector3(x,y,0);
        velosity = new Vector3(0,0,0);
        hero = new Texture("hero.jpg");
    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getHero() {
        return hero;
    }

    public void update(float dt){
        velosity.add(0,GRAVITY,0);
        velosity.scl(dt);
        position.add(0,velosity.y,0);

        velosity.scl(1/dt);

    }


}
