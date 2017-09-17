package collection;

import java.util.Collection;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Class Perfomance.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 09.09.17
 */
public class Perfomance {
    /**
     * Add string to Collection.
     * @param collection collection which add
     * @param amount amount of add
     * @return ms
     */
    public long add(Collection<String> collection, int amount) {
        char symbol;

        long start = System.nanoTime();

        for (int i = 1; i < amount; i++) {
            symbol = (char) (i + 160);
            collection.add(String.valueOf(symbol));
        }

        long finish = System.nanoTime();

        return (finish - start) / 1000000;
    }
    /**
     * Delete string at Collection.
     * @param collection collection which delete
     * @param amount amount of delete
     * @return ms
     */
    public long delete(Collection<String> collection, int amount) {
        char symbol;

        long start = System.nanoTime();

        for (int i = 0; i < amount; i++) {
            symbol = (char) (i + 160);
            collection.remove(String.valueOf(symbol));
        }

        long finish = System.nanoTime();

        return (finish - start) / 1000000;
    }
    /**
     * Main method.
     * @param args default
     */
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        ArrayList<String> aList = new ArrayList<>();
        TreeSet<String> tList = new TreeSet<>();

        Perfomance perf = new Perfomance();

        int curAmount = 60000;

        long llAdd = perf.add(lList, curAmount);
        long llDel = perf.delete(lList, curAmount);

        long alAdd = perf.add(aList, curAmount);
        long alDel = perf.delete(aList, curAmount);

        long tsAdd = perf.add(tList, curAmount);
        long tsDel = perf.delete(tList, curAmount);

        System.out.println("Collection rate Add:");
        System.out.println(String.format("1. ArrayList %s add is: %s ms.", curAmount, alAdd));
        System.out.println(String.format("2. LinkedList %s add is: %s ms.", curAmount, llAdd));
        System.out.println(String.format("3. TreeSet %s add is: %s ms.", curAmount, tsAdd));

        System.out.println();

        System.out.println("Collection rate Delete:");
        System.out.println(String.format("1. LinkedList %s delete is: %s ms.", curAmount, llDel));
        System.out.println(String.format("2. TreeSet %s delete is: %s ms.", curAmount, tsDel));
        System.out.println(String.format("3. ArrayList %s delete is: %s ms.", curAmount, alDel));
    }
}
