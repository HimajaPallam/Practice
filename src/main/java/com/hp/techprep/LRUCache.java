package com.hp.techprep;

import java.util.HashMap;
import java.util.Map;

class Node {
    int key;
    int value;
    Node prev;
    Node next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

    Node() {
        this(0, 0);
    }
}

public class LRUCache {
    private Map<Integer, Node> map;
    private Node head, tail;
    private int capacity;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insertAtFront(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insertAtFront(node);
            return;
        }

        if(map.size() == capacity) {
            Node lru = tail.prev;
            remove(lru);
            map.remove(key);
        }

        Node newNode = new Node(key, value);
        map.put(key, newNode);
        insertAtFront(newNode);

    }

    private void insertAtFront(Node newNode) {
        newNode.next = head.next;
        newNode.next.prev = newNode;
        newNode.prev = head;
        head.next = newNode;
    }

    private void remove(Node node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
}
