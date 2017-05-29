package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
<<<<<<< HEAD
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGdxGame;
=======
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.mygdx.game.MyGdxGame;
import com.badlogic.gdx.scenes.scene2d.Stage;
>>>>>>> 3255a3d3463f2dfa2a9e4295baacc919d714b16f

/**
 * Created by aizhan on 3/24/17.
 */

public class MenuState extends State{

<<<<<<< HEAD
    private Texture background;
    private Texture playBtn;
    private Texture contBtn;

    public MenuState(GameStateManagment gsm) {
        super(gsm);
        background = new Texture("wall.jpg");
        playBtn = new Texture("playbtn.png");
        contBtn = new Texture("contbtn.jpg");
=======
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
>>>>>>> 3255a3d3463f2dfa2a9e4295baacc919d714b16f
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()){
<<<<<<< HEAD
            gsm.set(new PlayState(gsm));
        }
=======
            if (play.isPressed()) {
                gsm.set(new PlayState(gsm));
            }
            if (quit.isPressed()){
                Gdx.app.exit();
            }
        }

>>>>>>> 3255a3d3463f2dfa2a9e4295baacc919d714b16f
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

<<<<<<< HEAD
    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0,0, MyGdxGame.WIDTH, MyGdxGame.HEIGHT);
        sb.draw(playBtn, (MyGdxGame.WIDTH/2)-(playBtn.getWidth()/2), MyGdxGame.HEIGHT/2);
        sb.draw(contBtn, (MyGdxGame.WIDTH/2)-(contBtn.getWidth()/2), MyGdxGame.HEIGHT/3);
        sb.end();
=======

    @Override
    public void render(SpriteBatch batch) {

        batch.begin();
        stage.act();
        stage.getBatch().begin();
        stage.getBatch().draw(background, 0,0, MyGdxGame.WIDTH, MyGdxGame.HEIGHT);
        stage.getBatch().end();
        stage.draw();
        batch.end();
>>>>>>> 3255a3d3463f2dfa2a9e4295baacc919d714b16f
    }

    @Override
    public void dispose() {
<<<<<<< HEAD
        background.dispose();
        playBtn.dispose();
        contBtn.dispose();
=======
>>>>>>> 3255a3d3463f2dfa2a9e4295baacc919d714b16f
    }
}
