package com.example.interviewquestionsandanswers.mapAndHashMap;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsExample {

    HashMap<String, Integer> empId = new HashMap<>();

    Map<String, Integer> empIdMap = new Map<String, Integer>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public Integer get(Object key) {
            return null;
        }

        @Override
        public Integer put(String key, Integer value) {
            return null;
        }

        @Override
        public Integer remove(Object key) {
            return null;
        }

        @Override
        public void putAll(Map<? extends String, ? extends Integer> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<String> keySet() {
            return null;
        }

        @Override
        public Collection<Integer> values() {
            return null;
        }

        @Override
        public Set<Entry<String, Integer>> entrySet() {
            return null;
        }
    };

    public HashMap<String, Integer> getEmpId() {
        return empId;
    }

    public Map<String, Integer> getEmpIdMap() {
        return empIdMap;
    }
}
