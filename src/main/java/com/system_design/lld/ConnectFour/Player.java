package com.system_design.lld.ConnectFour;

public class Player {
    private final String name;
    private final DiscColor discColor;

    public Player(String name, DiscColor discColor) {
        this.name = name;
        this.discColor = discColor;
    }

    public String getName() {
        return name;
    }

    public DiscColor getDiscColor() {
        return discColor;
    }
}
