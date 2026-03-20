package HashMap;
import java.util.ArrayList;
// import java.util.HashMap;
import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K,V> {

        private class Node {
            K key;
            V value;

            public Node(K key,V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n ;  // n  
        private int N ;
        // private int arr[]; 
        private LinkedList<Node> buckets[]; // N = buckets.length
  
        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i <buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;    // N = buckets.length
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;  // di = data index
             
            for(int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if(node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            buckets = new LinkedList[2 * N];
            N = 2 * N;

            for(int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            //nodes -> add in new buckets
            for(int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for(int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }

        }

        public void put(K key, V value) {   // O(1) 
            int bi = hashFunction(key); // 0 to n-1 == 3
            int di = SearchInLL(key, bi); // -1 if not found, otherwise index of the node in the bucket( Valid)

            if(di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n / N;
            if(lambda > 2.0) {
                rehash();
            } 
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key); // 0 to n-1 == 3
            int di = SearchInLL(key, bi); // -1 if not found, otherwise index of the node in the bucket( Valid)

            if(di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key); // 0 to n-1 == 3
            int di = SearchInLL(key, bi); // -1 if not found, otherwise index of the node in the bucket( Valid)

            if(di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key); // 0 to n-1 == 3
            int di = SearchInLL(key, bi); // -1 if not found, otherwise index of the node in the bucket( Valid)

            if(di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for(int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

    }
   public static void main(String[] args) {

        HashMap<String,Integer> Map = new HashMap<>();
        Map.put("India", 100);
        Map.put("China", 150);
        Map.put("USA", 50);
        Map.put("Nepal", 5);

        ArrayList<String> keys = Map.keySet();
        for(int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i));
        }

        System.out.println(Map.get("India"));
        System.out.println(Map.remove("China"));
        System.out.println(Map.get("China"));
   } 
}
