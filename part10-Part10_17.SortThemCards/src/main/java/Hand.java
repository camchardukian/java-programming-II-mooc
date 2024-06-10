import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        hand.forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(hand);
    }

    public void sortBySuit() {
        hand.sort(Comparator.comparing(Card::getSuit).thenComparingInt(Card::getValue));
    }

    @Override
    public int compareTo(Hand otherHand) {
        return Integer.compare(
                hand.stream().mapToInt(Card::getValue).sum(),
                otherHand.hand.stream().mapToInt(Card::getValue).sum());
    }
}
