/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.objective;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author User
 */
public class FizzBuzz {

    private Map<Integer, String> rules;

    public FizzBuzz() {
        this.rules = new HashMap();
    }

    public FizzBuzz(HashMap<Integer, String> rules) {
        this.rules = rules;
    }

    public void addCustomRule(int key, String str) {
        rules.put(key, str);
    }

    public void addFizzRule(int key) {
        rules.put(key, "Fizz");
    }

    public void addBuzzRule(int key) {
        rules.put(key, "Buzz");
    }

    public void removeRule(int key) {
        rules.remove(key);
    }

    public Map<Integer, String> getRules() {
        return rules;
    }

    public void setRules(Map<Integer, String> rules) {
        this.rules = rules;
    }

    public List<String> generate(int start, int end) {
        String str;
        var result = new ArrayList();
        for (Integer i = start; i <= end; i++) {
            str = "";
            for (Entry<Integer, String> entry : rules.entrySet()) {
                str += concatStr(i, entry.getKey(), entry.getValue());
            }
            result.add(str.equals("") ? i.toString() : str);
        }

        return result;
    }

    private static String concatStr(int i, int n, String str) {
        return (i % n == 0) ? str : "";
    }

}
