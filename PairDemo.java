class Pair<K, V> {
    K key;
    V value;
    Pair(K key, V value) { this.key = key; this.value = value; }
    public String toString() { return "(" + key + ", " + value + ")"; }
}
public class PairDemo {
    public static void main(String[] args) {
        Pair<String, Integer> age = new Pair<>("Age", 25);
        Pair<String, String> country = new Pair<>("Country", "Japan");
        System.out.println(age);      
        System.out.println(country); 
    }
}
