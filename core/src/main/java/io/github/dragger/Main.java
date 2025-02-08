package io.github.dragger;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    Rectangle rect;
    private Texture image;
    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("drawing.png");
        rect = new Rectangle(10,10,10,10);
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
//        for(int i = 0 ; i<20; i++){
//            for(int j = 0 ; j<20 ; j++){
//                batch.draw(image, i*7, j*6);
//            }
//        }
        batch.draw(image,700,700);

        batch.end();
    }
    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
