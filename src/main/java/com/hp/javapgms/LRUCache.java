package com.hp.javapgms;

import java.util.HashMap;
import java.util.Map;

/*Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
int get(int key) Return the value of the key if the key exists, otherwise return -1.
void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair 
to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
The functions get and put must each run in O(1) average time complexity.*/


/*Solution: For optimizing time complexity, searching can be replaced using hashmap key value pairs.
Then using linkedlist helps shifiting numbers by removing and inserting them directly with less time complexity O(1)
*/
public class LRUCache {
	private Node head = new Node(0,0);
	private Node tail = new Node(0,0);
	private int capacity;
	private Map<Integer, Node> map = new HashMap<Integer, Node>();
	
	class Node{
		int key, value;
		Node next, prev;
		Node(int key, int value){
			this.key= key;
			this.value = value;
		}
	}
	
	public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.next = head;
    }
	
	public int get(int key) {
		if(!map.containsKey(key)) {
			return -1;
		}
		Node node = map.get(key);
		remove(node);
		insert(node);
		return node.value;
	}
	
	private void remove(Node node) {
		map.remove(node.key);
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}
	
	// This method adds the node right at the next of the head
    // as well as it puts a new mapping into the hashmap
	private void insert(Node node) {
		map.put(node.key, node);
		Node headNext = head.next;
		headNext.prev = node;
		node.next = headNext;
		head.next = node;
		headNext.prev = node;
		node.prev = head;
	}
	
	public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        // if map size has reached max capacity, we will remove/evict the
        // LEAST RECENTLY USED node that will be right before the tail of linkedlist
        if (map.size() == capacity) {
            remove(tail.prev);
        }
        // we will insert the new node at head's next and put it in the map
        insert(new Node(key, value));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache lru = new LRUCache(3);
		lru.put(1, 1);
		lru.put(2, 2);
		lru.put(3, 3);
		lru.put(2, 4);
		lru.put(5, 5);
		
	}

}
