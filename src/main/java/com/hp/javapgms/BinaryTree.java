package com.hp.javapgms;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	class Node {
		  int data;
		  Node left;
		  Node right;
		  
		  public Node(int data) {
		    this.data = data;
		  }
		}
	
	  Node root;
	  
	  public void addNode(int data) {
	    Node newNode = new Node(data);
	  
	    if (root == null) {
	      root = newNode;
	    } else {
	      Node focusNode = root;
	      Node parent;
	  
	      while (true) {
	        parent = focusNode;
	  
	        if (data < focusNode.data) {
	          focusNode = focusNode.left;
	          if (focusNode == null) {
	            parent.left = newNode;
	            return;
	          }
	        } else {
	          focusNode = focusNode.right;
	          if (focusNode == null) {
	            parent.right = newNode;
	            return;
	          }
	        }
	      }
	    }
	  }
	  
	  public void preOrderTraversal(Node focusNode) {
	    if (focusNode != null) {
	      System.out.print(focusNode.data + " ");
	      preOrderTraversal(focusNode.left);
	      preOrderTraversal(focusNode.right);
	    }
	  }
	  
	  public void InOrderTraversal(Node focusNode) {
	    if (focusNode != null) {
	      InOrderTraversal(focusNode.left);
	      System.out.print(focusNode.data + " ");
	      InOrderTraversal(focusNode.right);
	    }
	  }
	  
	  public void postOrderTraversal(Node focusNode) {
	    if (focusNode != null) {
	      postOrderTraversal(focusNode.left);
	      postOrderTraversal(focusNode.right);
	      System.out.print(focusNode.data + " ");
	    }
	  }
	  
	  //BFS
	  public void levelwiseTraversal(Node node) {
		  Queue<Node> queue = new LinkedList<Node>();
	        queue.add(root);
	        while (!queue.isEmpty()) {
	 
	            /* poll() removes the present head.*/
	            Node tempNode = queue.poll();
	            System.out.print(tempNode.data + " ");
	 
	            /*Enqueue left child */
	            if (tempNode.left != null) {
	                queue.add(tempNode.left);
	            }
	            /*Enqueue right child */
	            if (tempNode.right != null) {
	                queue.add(tempNode.right);
	            }
	        }
	  }
	
	  public static void main(String[] args) {
		  BinaryTree tree = new BinaryTree();
		    tree.addNode(50);
		    tree.addNode(25);
		    tree.addNode(75);
		    tree.addNode(12);
		    tree.addNode(37);
		    tree.addNode(43);
		    tree.addNode(30);
		  
	  }
}


