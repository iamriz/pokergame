package com.exam.poker.game;

import org.junit.Test;

import com.exam.poker.game.Player;

import static org.junit.Assert.*;

public class PlayerTest {

	@Test
	public void getName() {
		Player player = new Player("Name");

		assertEquals("Name", player.getName());
	}

}