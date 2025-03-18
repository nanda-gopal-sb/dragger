package io.github.dragger;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    ShapeRenderer shape;
    Rectangle rect;
    private Texture image;

    @Override
    public void create() {
        shape = new ShapeRenderer();
        batch = new SpriteBatch();
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        shape.begin(ShapeType.Line);
        shape.setColor(Color.RED);
        int gridSize = 100;
        for (int x = 0; x < 800; x += gridSize) {
            for (int y = 0; y < 600; y += gridSize) {
                shape.rect(x, y, gridSize, gridSize);
            }
        }
        shape.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
