package com.ramesh.java.collections.map.patterns.treemap.problems;

import java.util.Map;
import java.util.TreeMap;

public class MergeMaps {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> m1 = new TreeMap<>();
        m1.put(1, 15);
        m1.put(2, 20);
        m1.put(3, 25);
        TreeMap<Integer, Integer> m2 = new TreeMap<>();
        m2.put(2, 10);
        m2.put(3, 15);
        m2.put(4, 30);

        System.out.println(mergeMaps(m1, m2));
    }

    /**
     * Write a method which returns map which is merged upon 2 maps.
     * If common key is there add the values
     * @param m1 -> TreeMap<Integer, Integer> object
     * @param m2 -> TreeMap<Integer, Integer> object
     * @return merged TreeMap<Integer, Integer> map
     * */
    public static TreeMap<Integer, Integer> mergeMaps(
            TreeMap<Integer, Integer> m1,
            TreeMap<Integer, Integer> m2
    ) {
        for(Map.Entry<Integer, Integer> entry : m2.entrySet()) {
            m1.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return m1;
    }
}
