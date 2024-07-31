package com.firstSpringProj.learning.spring.framework.game;

public class MarioGame implements GamingConsole {

    @Override
    public void up() {
    System.out.println("jump");
    }
    @Override
    public void down() {
    System.out.println("Dutch");
    }
    @Override
    public void left() {
    System.out.println("Knock");
    }
    @Override
    public void right() {
    System.out.println("Boost");
    }
}
