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
    //private TurnToLeft heroLeft;
    //public enum State {FALLING, JUMPING, WALKING,STANDING};
   // public State currentState;
   // public State previousState;
   // private Animation heroWalk;
   // private Animation heroJump;
  //  private float stateTimer;
//
    public Hero(int x, int y){
        position = new Vector3(x,y,0);
        texture = new Texture(state);
        heroAnimation = new Animation(new TextureRegion(texture), statediv, 1f);
       // currentState = State.STANDING;
        //previousState = State.STANDING;
       // stateTimer = 0;
       // walkingRight = true;

       /* Array<TextureRegion> frames = new Array<TextureRegion>();
        for(int i=0;i<3;i++)
            frames.add(new TextureRegion(getTexture(),i*16,0,16,16));
        heroWalk = new Animation(0.1f,frames);
        frames.clear();*/
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
