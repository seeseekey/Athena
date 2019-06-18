package com.example.athena.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.example.athena.AthenaGame;

public class MenuScreen implements Screen {

    private final Stage stage;
    private final Skin skin;
    private final AthenaGame game;

    public MenuScreen(AthenaGame game) {

        this.game = game;
        this.stage = new Stage(new ScreenViewport());
        this.skin = new Skin(Gdx.files.internal("skin/kenney/kenney-test.json"));

        TextButton startGame = new TextButton("Start game", skin);
        startGame.setWidth((Gdx.graphics.getWidth() / 2));
        startGame.setPosition(Gdx.graphics.getWidth() / 2f - startGame.getWidth() / 2f, Gdx.graphics.getHeight() / 2f - startGame.getHeight() / 2f);

        startGame.addListener(new EventListener() {
            @Override
            public boolean handle(final Event event) {
                game.setScreen(new GameScreen(game));
                return true;
            }
        });

        stage.addActor(startGame);
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(final float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();
    }

    @Override
    public void resize(final int width, final int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
        stage.dispose();
    }
}
