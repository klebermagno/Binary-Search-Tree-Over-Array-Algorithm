package com.km.algorithm.datastructure.binarytree;

public class Binarytree {

    public int[] tree;

    public Binarytree(int[] tree) {
        this.tree = tree;
    }

    public int[] balanceTree() {

        return this.tree;
    }

    public int findElement(int i) {
        this.balanceTree();
        int index = this.binarysearch(tree, i, tree[0], tree[tree.length - 1]);
        if (index != -1) {
            System.out.printf("%d found in: %d ", i, index);
        } else {
            System.out.printf("%d not found!", i);
        }

        return index;
    }

    private int binarysearch(int[] array, int search, int low, int hight) {

        if (low > hight) {
            return -1;
        }

        int mid = ( hight - low) / 2;

        if (array[mid] == search) {
            return mid;
        } else if (array[mid]<search) {
            //right
            return binarysearch(array, search,mid+1,hight);
        }else{
            //left
            return binarysearch(array,search,low,mid-1);

        }

    }
}
