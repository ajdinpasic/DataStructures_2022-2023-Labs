package org.lab9;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    private Node<Key, Value> root;

    /* Retrieve a value associated with a given key */
    public Value get(Key key) {
        Node<Key, Value> x = root;				// 1

        while (x != null) {						// 2
            int cmp = key.compareTo(x.key);		// 3
            if (cmp < 0) {						// 4
                x = x.left;						// 4
            } else if (cmp > 0) {				// 5
                x = x.right;					// 5
            } else {							// 6
                return x.value;					// 6
            }
        }

        return null;							// 7
    }

    /* Return the size of the BST (total number of nodes) */
    public int size() {
        return size(root);							// 1
    }

    /* Private size() method */
    private int size(Node<Key, Value> x) {
        if (x == null) {							// 2
            return 0;								// 2
        }
        return x.size;								// 3
    }

    /* Add a value to the BST under a given key */
    public void put(Key key, Value value) {
        root = put(root, key, value);												// 1
    }

    /* Private put() method */
    private Node<Key, Value> put(Node<Key, Value> x, Key key, Value value) {
        if (x == null) {															// 2
            return new Node<Key, Value>(key, value);								// 2
        }

        int cmp = key.compareTo(x.key);												// 3
        if (cmp < 0) {																// 4
            x.left = put(x.left, key, value);										// 4
        } else if (cmp > 0) {														// 5
            x.right = put(x.right, key, value);										// 5
        } else {																	// 6
            x.value = value;														// 6
        }

        x.size = 1 + size(x.left) + size(x.right);									// 7
        return x;																	// 8
    }

    /* Find the minimum key of the BST */
    public Key findMin() {
        return findMin(root).key; 									// 1
    }

    /* Private findMin() method */
    private Node<Key, Value> findMin(Node<Key, Value> x) {
        if (x.left == null) {										// 2
            return x;												// 2
        }
        return findMin(x.left);										// 3
    }

    /* Find the maximum key of the BST */
    public Key findMax() {
        return findMax(root).key; 									// 1
    }

    /* Private findMax() method */
    private Node<Key, Value> findMax(Node<Key, Value> x) {
        if (x.right == null) {										// 2
            return x;												// 2
        }
        return findMax(x.right);									// 3
    }

    /* Find the rank of a given key */
    public int rank(Key key) {
        return rank(root, key);									// 1
    }

    /* Private rank() method */
    private int rank(Node<Key, Value> x, Key key) {
        if (x == null) {										// 2
            return 0;											// 2
        }

        int cmp = key.compareTo(x.key);							// 3
        if (cmp < 0) {											// 4
            return rank(x.left, key);							// 4
        } else if (cmp > 0) {									// 5
            return 1 + size(x.left) + rank(x.right, key);		// 5
        } else {												// 6
            return size(x.left);								// 6
        }
    }

    /* Delete the node with the minimum key */
    public void deleteMin() {
        root = deleteMin(root);									// 1
    }

    /* Private deleteMin() method */
    private Node<Key, Value> deleteMin(Node<Key, Value> x) {
        if (x.left == null) {									// 2
            return x.right;										// 2
        }

        x.left = deleteMin(x.left);								// 3
        x.size = 1 + size(x.left) + size(x.right);				// 4

        return x;												// 5
    }

    /* Delete a node with the given key */
    public void delete(Key key) {
        root = delete(root, key);										// 1
    }

    /* Private delete() method */
    private Node<Key, Value> delete(Node<Key, Value> x, Key key) {
        if (x == null) {												// 2
            return null;												// 2
        }

        int cmp = key.compareTo(x.key);									// 3
        if (cmp < 0) {													// 4
            x.left = delete(x.left, key);								// 4
        } else if (cmp > 0) {											// 5
            x.right = delete(x.right, key);								// 5
        } else {														// 6
            if (x.right == null) {										// 6
                return x.left;											// 6
            }
            if (x.left == null) {										// 7
                return x.right;											// 7
            }

            Node<Key, Value> t = x;										// 8
            x = findMin(t.right);										// 8
            x.right = deleteMin(t.right);								// 8
            x.left = t.left;											// 8
        }
        x.size = 1 + size(x.left) + size(x.right);						// 9
        return x;														// 10
    }

    /* Simple in-order traversal */
    public void iterate() {
        inorder(root);
    }

    /* Private inorder() method */
    private void inorder(Node<Key, Value> x) {
        if (x == null) {
            return;
        }

        inorder(x.left);
        System.out.println(x.key);
        inorder(x.right);
    }
}
