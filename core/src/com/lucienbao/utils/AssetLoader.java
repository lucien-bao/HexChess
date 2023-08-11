package com.lucienbao.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader {
    public static Texture texture;
    public static TextureRegion[][] pieces;
    public static Texture splash;

    public static Texture pawnDiagram;
    public static Texture knightDiagram;
    public static Texture bishopDiagram;
    public static Texture rookDiagram;
    public static Texture queenDiagram;
    public static Texture kingDiagram;

    public static final int PIECE_WIDTH = 64;

    // TODO: sounds

    public static void load() {
        texture = new Texture(Gdx.files.internal("caliente/texture.png"));

        // 2 colors, 6 pieces per color
        pieces = new TextureRegion[2][6];
        for(int color = 0; color < 2; color++) {
            for(int piece = 0; piece < 6; piece++) {
                pieces[color][piece] = new TextureRegion(texture,
                        piece * 64, color * 64,
                        64, 64);
            }
        }

        splash = new Texture(Gdx.files.internal("caliente/knight-big.png"));

        pawnDiagram = new Texture(Gdx.files.internal("pawn-diagram.png"));
        knightDiagram = new Texture(Gdx.files.internal("knight-diagram.png"));
        bishopDiagram = new Texture(Gdx.files.internal("bishop-diagram.png"));
        rookDiagram = new Texture(Gdx.files.internal("rook-diagram.png"));
        queenDiagram = new Texture(Gdx.files.internal("queen-diagram.png"));
        kingDiagram = new Texture(Gdx.files.internal("king-diagram.png"));
    }

    public static void dispose() {
        texture.dispose();
    }
}
