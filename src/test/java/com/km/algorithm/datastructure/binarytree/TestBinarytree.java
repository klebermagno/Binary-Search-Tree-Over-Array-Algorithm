package com.km.algorithm.datastructure.binarytree;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestBinarytree {

    @Test
    public void testFindElementLeft(){
        int[] param = {2, 4, 6,8, 10,11,12,13};
        Binarytree btree = new Binarytree(param);
        int pos = btree.findElement(4);
       assertEquals(1,pos);
    }

    @Test
    public void testFindElementRight(){
        int[] param = {2, 4, 6,8, 10,11,12,13};
        Binarytree btree = new Binarytree(param);
        int pos = btree.findElement(11);
        assertEquals(5,pos);
    }
    @Test
    public void testBalanceTree(){
        int[] param = {16, 14, 12,11,10,9,8,7,6,5,4,3,1,2};
        int[] paramBalanced = {1,2,3,4,5,6,7,8,9,10,11,12,14,16};
        Binarytree btree = new Binarytree(param);
        int[] balanceTree = btree.balanceTree();
        assertArrayEquals(paramBalanced,balanceTree);
    }
}
