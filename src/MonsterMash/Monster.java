package MonsterMash;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monster {
    private int height, weight, age;

    public Monster(int h, int w, int a) {
        height = h;
        weight = w;
        age = a;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "" + height + " " + weight + " " + age;
    }

    public boolean isBigger(int n) {
        boolean bb = n < height;
        return bb;
    }

    public boolean isSmaller(int m) {
        boolean bs = m > height;
        return bs;
    }


    //build your own Monster class
    //with methods like isBigger and isSmaller
    //or use your Monster class from
    //lab18 lab set 1
}