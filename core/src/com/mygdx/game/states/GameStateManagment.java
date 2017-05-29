package com.mygdx.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
<<<<<<< HEAD
=======
import com.badlogic.gdx.scenes.scene2d.Stage;
>>>>>>> 3255a3d3463f2dfa2a9e4295baacc919d714b16f

import java.util.Stack;

/**
 * Created by aizhan on 3/24/17.
 */

<<<<<<< HEAD
public class GameStateManagment {
=======
public class GameStateManagment extends Stage {
>>>>>>> 3255a3d3463f2dfa2a9e4295baacc919d714b16f

    private Stack<State> states;

    public GameStateManagment(){
        states = new Stack<State>();
    }

    public void push(State state){
        states.push(state);
    }

    public void pop(){
        states.pop().dispose();
    }

    public void set(State state){
        states.pop().dispose();
        states.push(state);
    }

    public void update(float dt){
        states.peek().update(dt);
    }

    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
}
