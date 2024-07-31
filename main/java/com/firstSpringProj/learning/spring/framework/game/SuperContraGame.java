package com.firstSpringProj.learning.spring.framework.game;

public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("Fly");
	}
	public void down() {
		System.out.println("Rest");
	}
	public void left() {
		System.out.println("Dutch");
	}
	public void right() {
		System.out.println("Fight");
	}
}
