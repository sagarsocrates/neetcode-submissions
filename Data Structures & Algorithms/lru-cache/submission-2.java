private class Node {
    int key;
    int val;
    Node next;
    Node prev;
    Node(int key, int val){
        this.key = key;
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
class LRUCache {

    private int capacity;
    private HashMap<Integer,Node> cache;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head = new Node(-1,-1); 
        tail = new Node(-1,-1);   
        head.next = tail;
        tail.prev = head;
    }
    
    public void insert(Node node){
        Node next = head.next;
        head.next = node;
        node.next = next;
        node.prev = head;
        next.prev = node;
    }

    public void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }
        Node hit = cache.get(key);
        remove(hit);
        insert(hit);
        return hit.val;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node existing = cache.get(key);
            existing.val = value;
            remove(existing);
            insert(existing);
        }
        else{
            if(cache.size()==capacity){
                Node lru = tail.prev;
                remove(lru);
                cache.remove(lru.key);
            }
            Node node = new Node(key,value);
            insert(node);
            cache.put(key,node); 
        }
    }
}
