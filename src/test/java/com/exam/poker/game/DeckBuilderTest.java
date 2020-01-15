package com.exam.poker.game;

import org.junit.Test;

import com.exam.poker.deck.Deck;
import com.exam.poker.deck.DeckBuilder;

import static org.junit.Assert.*;

public class DeckBuilderTest {

	@Test
	public void buildDeck() {
		DeckBuilder deckBuilder = new DeckBuilder();

		Deck deck = deckBuilder.buildDeck();

		assertEquals(52, deck.size());
	}

}