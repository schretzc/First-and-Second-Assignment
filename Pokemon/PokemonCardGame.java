

import java.util.Random;
import java.util.ArrayList;
public class PokemonCardGame {
    //deck of cards
    private ArrayList<Card> deck;  //this is the constructors job= new Card[];
    private ArrayList<Card> hand;
    public PokemonCardGame(){
        deck = new ArrayList<Card>();
        hand = new ArrayList<Card>();

        deck.add(new Pokemon());
        int deckSize = 60;
        for(int i = 1; i < deckSize; i++){
            deck.add(new Energy());
        }
    }

    public Card drawCard() { //not draw card and put in hand

        Random rng = new Random();
        //System.out.println(deck.size());
        int cardIndex = rng.nextInt(deck.size() ); //find random card
        Card drawnCard = deck.get(cardIndex);
        deck.remove(cardIndex);
        return drawnCard;
    }

    public void drawHand(){
        for(int i = 0; i < 7; i++) { //counting to 7
            
            hand.add(drawCard());
        }
    }

    public boolean evaluateOpeningHand(){
        boolean havePokemon = false;
        for(int i = 0; i < hand.size(); i++){
            Card currentCard = hand.get(i);
            if(currentCard instanceof Pokemon){
                havePokemon = true;
            }
        }
        return havePokemon;
    }

    //make engine for program

    public void run() {
        drawHand();
        System.out.println("Has Pokemon: " + evaluateOpeningHand());  
    }
}
