package com.exam.poker.hand.types;

import com.exam.poker.card.Card;
import com.exam.poker.hand.Hand;
import com.exam.poker.hand.HandType;

import java.util.List;

/**
 * @see <a href="https://en.wikipedia.org/wiki/List_of_poker_hands#High_card">What is a High Card?</a>
 */
public class HighCard extends Hand {

    private List<Card> cards;

    public HighCard(List<Card> cards) {
        this.cards = cards;
    }

    public HandType getHandType() {
        return HandType.HIGH_CARD;
    }

    /**
     * @return The cards ordered by descending rank, e.g. A,K,Q,3,2
     */
    @Override
    public String toString() {
        return "";
    }

}
