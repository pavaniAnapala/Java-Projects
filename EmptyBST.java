/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BinarySearchTree;

/**
 *
 * @author Asus
 * @param <D>

 */
public class EmptyBST<D extends Comparable> implements Tree<D> {
public EmptyBST(){
    
}
public boolean isEmpty(){
    return true;
}
public int cardinality (){
    return 0;
}
public boolean member(D ele){
    return false;
}
public NonEmptyBST<D> add(D ele){
    return new NonEmptyBST<D> (ele);
}
}
