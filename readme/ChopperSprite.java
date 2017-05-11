package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.sun.org.apache.xpath.internal.operations.String;

public class ChopperSprite extends ApplicationAdapter {
    public static final int WIDTH= 1920;
    public static final int HEIGHT=1080;
    public static final java.lang.String TITLE="Chopper";
    SpriteBatch batch;
    TextureAtlas chopperStay;
    Animation stay;
    float timePassed=0;

    @Override
    public void create () {
        batch = new SpriteBatch();
        chopperStay = new TextureAtlas(Gdx.files.internal("chopperStay.atlas"));
        stay = new Animation(1/0.9f, chopperStay.getRegions());
    }

    @Override
    public void render () {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        timePassed += Gdx.graphics.getDeltaTime();
        batch.draw((TextureRegion) stay.getKeyFrame(timePassed, true), 300, 500);
        batch.end();
    }

    @Override
    public void dispose () {
        batch.dispose();
        chopperStay.dispose();
    }
}