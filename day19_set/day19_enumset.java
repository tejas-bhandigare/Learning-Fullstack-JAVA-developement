package day19_set;

import java.util.EnumSet;
import java.util.Set;

enum Gfg { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ };

public class day19_enumset {
    
    public static void main(String[] args) {
          Set<Gfg> set1;

        // Adding the elements
        set1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE,Gfg.LEARN, Gfg.CODE);

        System.out.println("Set 1: " + set1);
    }
}
