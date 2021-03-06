package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
<<<<<<< HEAD
import com.badlogic.gdx.math.Vector3;

import java.util.Vector;

=======
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

>>>>>>> 3255a3d3463f2dfa2a9e4295baacc919d714b16f
/**
 * Created by aizhan on 3/24/17.
 */

public class Hero {
<<<<<<< HEAD
    public static final int GRAVITY = -1;
    private Vector3 position;
    private Vector3 velosity;

    private Texture hero;

    public Hero(int x, int y){
        position = new Vector3(x,y,0);
        velosity = new Vector3(0,0,0);
        hero = new Texture("hero.png");
=======
    private Vector3 position;
    private static final int WALL =0;
    private Vector3 velosity;
    private Texture texture;
    private Animation heroAnimation;
    private Rectangle bound;
    private int state; //1-stay; 2-turn left; 3-turn right; 4-left go; 5- right go;
    private int edge;


    public Hero(int x, int y){
        state = 1;
        position = new Vector3(x,y,0);
        velosity = new Vector3(0,0,0);
        texture = new Texture("stay.png");
        heroAnimation = new Animation(new TextureRegion(texture), 3, 1f);
        bound = new Rectangle(x, y, texture.getWidth(), texture.getHeight());
        edge = 0;
>>>>>>> 3255a3d3463f2dfa2a9e4295baacc919d714b16f
    }

    public Vector3 getPosition() {
        return position;
    }

<<<<<<< HEAD
    public Texture getHero() {
        return hero;
    }

    public void update(float dt){
        velosity.add(0,GRAVITY,0);
        velosity.scl(dt);
        position.add(0,velosity.y,0);

        velosity.scl(1/dt);

    }


=======
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
        if (this.getState() == 4){
            if (position.x > 0)
                velosity.add(WALL, 0, 0);
            velosity.scl(dt);
            position.add(velosity.x, 0, 0);
            if (position.x > 1700)
                position.x = 1700;
        }
        else {
            if (position.x > 0)
                velosity.add(WALL, 0, 0);
            velosity.scl(dt);
//            position.add(velosity.x, 0, 0);
            position.sub(velosity.x, 0, 0);
        }
        heroAnimation.updates(dt);
        bound.setPosition(position.x, position.y);
    }


    public void stay(){
        this.state=1;
        this.texture = new Texture("stay.png");
        this.heroAnimation = new Animation(new TextureRegion(texture), 3, 1f);
    }

    public void turnleft(){
        this.state=2;
        this.texture = new Texture("left.png");
        this.heroAnimation = new Animation(new TextureRegion(texture), 4, 1f);
    }

    public void turnright(){
        this.state=3;
        this.texture = new Texture("right.png");
        this.heroAnimation = new Animation(new TextureRegion(texture), 4, 1f);
    }

    public void walkleft(int edge){
        state = 4;
        texture = new Texture("left_go.png");
        heroAnimation = new Animation(new TextureRegion(texture), 6, 1f);
        this.edge = edge;
    }

    public void Walking(){
        velosity.x=1920;
    }

    public void walkright(){
        state = 5;
        texture = new Texture("right_go.png");
        heroAnimation = new Animation(new TextureRegion(texture), 6, 1f);
    }

    public int getX(){
        return (int)this.position.x;
    }
    public int getState(){
        return this.state;
    }

    public void dispose(){
        texture.dispose();
    }

    public Rectangle getBound(){
        return bound;
    }
>>>>>>> 3255a3d3463f2dfa2a9e4295baacc919d714b16f
}
