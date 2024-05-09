package ru.thomaskohouse.enums;

public enum Sizes {
    WINDOW_WIDTH(700),
    WINDOW_HEIGHT(800),
    SCORE_RECTANGLE_WIDTH(200),
    SCORE_RECTANGLE_HEIGHT(70),
    SCORE_RECT_ARC_WIDTH(10),
    SCORE_RECT_INDENT_Y(20),
    SCORE_RECT_ARC_HEIGHT(10),
    BACKGROUND_RECTANGLE(600),
    BACKGROUND_INDENT_X(45),
    BACKGROUND_INDENT_Y(100),
    BACKGROUND_RECT_ARC_WIDTH(30),
    BACKGROUND_RECT_ARC_HEIGHT(30),
    GAME_RECTANGLE(145),
    DISTANCE_BETWEEN_GAME_RECTANGLE(4),
    GAME_RECT_ARC_WIDTH(20),
    GAME_RECT_ARC_HEIGHT(20);

    private final int value;

    Sizes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
