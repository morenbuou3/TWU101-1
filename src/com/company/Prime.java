package com.company;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    public void generate(int n) {
        int temp = n;
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= temp / i; i++) {
            while (temp % i == 0) {
                result.add(i);
                temp /= i;
            }
        }
        if (temp > 1) {
            result.add(temp);
        }

        for (int i = 0; i < result.size(); i++) {
            if (i != result.size() - 1) {
                System.out.print(result.get(i) + ",");
            } else {
                System.out.println(result.get(i));
            }
        }
    }
}
