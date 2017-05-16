package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.mygdx.game.MyGdxGame;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by aizhan on 3/24/17.
 */

public class MenuState extends State{

    private Texture background, playBtn, contBtn, soundBtn, soundOffBtn, quitBtn;
    private TextureRegion playTextureRegion, contTextureRegion, soundTextureRegion, soundOffTextureRegion, quitTextureRegion;
    private TextureRegionDrawable playDrawable, contDrawable, soundDrawable, soundOffDrawable, quitDrawable;
    private ImageButton play, contin, sound, soundoff, quit;
    private Stage stage;
    private SpriteBatch b;

    public MenuState(final GameStateManagment gsm) {
        super(gsm);

        background = new Texture("menu_back.png");
        playBtn = new Texture("playbtn.png");
        contBtn = new Texture("contbtn.png");
        soundBtn = new Texture("soundbtn_on.png");
        soundOffBtn = new Texture("soundbtn_off.png");
        quitBtn = new Texture("quitbtn.png");
        playTextureRegion = new TextureRegion(playBtn, 741, 235);
        contTextureRegion = new TextureRegion(contBtn, 741, 235);
        soundTextureRegion = new TextureRegion(soundBtn, 741, 235);
        soundOffTextureRegion = new TextureRegion(soundOffBtn, 741, 235);
        quitTextureRegion = new TextureRegion(quitBtn, 741, 235);
        playDrawable = new TextureRegionDrawable(playTextureRegion);
        contDrawable = new TextureRegionDrawable(contTextureRegion);
        soundDrawable = new TextureRegionDrawable(soundTextureRegion);
        soundOffDrawable = new TextureRegionDrawable(soundOffTextureRegion);
        quitDrawable = new TextureRegionDrawable(quitTextureRegion);
        play = new ImageButton(playDrawable);
        contin = new ImageButton(contDrawable);
        sound = new ImageButton(soundDrawable);
        soundoff = new ImageButton(soundOffDrawable);
        quit = new ImageButton(quitDrawable);
        stage = new Stage();
        stage.clear();
        Gdx.input.setInputProcessor(stage);
        play.setPosition((MyGdxGame.WIDTH/2)-(playBtn.getWidth()), (MyGdxGame.HEIGHT)-(playBtn.getHeight()+80));
        contin.setPosition((MyGdxGame.WIDTH/2)-(contBtn.getWidth()), (MyGdxGame.HEIGHT)-(contBtn.getHeight()+320));
        sound.setPosition((MyGdxGame.WIDTH/2)-(soundBtn.getWidth()),(MyGdxGame.HEIGHT)-(soundBtn.getHeight()+550));
        quit.setPosition((MyGdxGame.WIDTH/2)-(quitBtn.getWidth()), (MyGdxGame.HEIGHT)-(quitBtn.getHeight()+780));
        play.isTouchable();
        stage.addActor(play);
        stage.addActor(contin);
        stage.addActor(sound);
        stage.addActor(quit);
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()){
            if (play.isPressed()) {
                gsm.set(new PlayState(gsm));
            }
            if (quit.isPressed()){
                Gdx.app.exit();
            }
        }

    }

    @Override
    public void update(float dt) {
        handleInput();
    }


    @Override
    public void render(SpriteBatch batch) {

        batch.begin();
        stage.act();
        stage.getBatch().begin();
        stage.getBatch().draw(background, 0,0, MyGdxGame.WIDTH, MyGdxGame.HEIGHT);
        stage.getBatch().end();
        stage.draw();
        batch.end();
    }

    @Override
    public void dispose() {
    }
}
