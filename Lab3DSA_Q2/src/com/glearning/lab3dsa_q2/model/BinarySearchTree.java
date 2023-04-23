package com.glearning.lab3dsa_q2.model;

public class BinarySearchTree {
	
	private Node root;
	
	private static class Node {
		int val;
		Node left;
		Node right;
		
		public Node(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}
	
	public BinarySearchTree() {
		root = null;
	}
	
	public void insert(int val) {
		root = insert(root, val);
	}
	
	private Node insert(Node node, int val) {
		if(node == null) {
			//root node
			return new Node(val);
		}
		if(val < node.val) {
			node.left = insert(node.left, val);
		}
		if(val > node.val) {
			node.right = insert(node.left, val);
		}
		return node;
	}
}

