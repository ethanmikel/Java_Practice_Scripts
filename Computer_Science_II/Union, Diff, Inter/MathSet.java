//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSet {
        private Set<Integer> one = new TreeSet<Integer>();
        private Set<Integer> two = new TreeSet<Integer>();
        private Set<Integer> temp = new TreeSet<Integer>();

        public MathSet() {
                System.out.println(" ");
        }
        public MathSet(String o, String t) {
            String[] str_o = o.split(" ");
            String[] str_t = t.split(" ");
            for(String s : str_o){
               one.add(Integer.parseInt(s));
            }
            for(String s : str_t){
               two.add(Integer.parseInt(s));
            }
        }
        public Set<Integer> union() {
                temp.clear();
                temp.addAll(one);
                temp.addAll(two);
                return temp;
        }
        public Set<Integer> intersection() {
                temp.clear();
                temp.addAll(one);
                temp.retainAll(two);
                return temp;
        }
        public Set<Integer> differenceAMinusB() {
                temp.clear();
                temp.addAll(one);
                temp.removeAll(two);
                return temp;
        }
        public Set<Integer> differenceBMinusA() {
                temp.clear();
                temp.addAll(two);
                temp.removeAll(one);
                return temp;
        }
        public Set<Integer> symmetricDifference() {
                temp.clear();
                temp.addAll(one);
                temp.removeAll(two);
                Set<Integer> t1 = new TreeSet<>(temp);
                temp.clear();
                temp.addAll(two);
                temp.removeAll(one);
                Set<Integer> t2 = new TreeSet<>(temp);
                t1.addAll(t2);
                return t1;
        }
        public String toString() {
                return "Set one " + one + "\n" +        "Set two " + two +  "\n";
        }
}