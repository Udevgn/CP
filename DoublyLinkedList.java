/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class DoublyLinkedList<Integer>
{
    
    public static class Node<Integer>
    {
        private Integer element;
        private Node<Integer> prev;
        private Node<Integer> next;
        public Node<Integer>(Integer e,Node<Integer> p,Node<Integer> n){
            element = e;
            prev = p;
            next = e;
        }
        public Integer getElement(){
            return element;
        }
        public Node<Integer> getPrevious(){
            return prev;
        }
        public getNext(){
            return next;
        }
        public setPrev(Node<Integer> p){
             prev = p;
        }
        public setNext(Node<Integer> n){
            next = n;
        }
    }
    
    
    private Node<Integer> header ;
    private Node<Integer> trailer;
    private Integer size =0;
    publc DoublyLinkedList(){
        header = new Node<Integer>(0,null,null);
        trailer = new Node<Integer>(0,null,null);
        header.setNext(trailer);
        
    }
    public int size(){
        return size;
    }
    public int isEmpty(){
        return size==0;
    }
    public Integer getFirst(){
        if(isEmpty()== true)
          return -99999;
        return header.getNext().getElement();
    }
    public Integer getLast(){
        if(isEmpty()== true)
          return -99999;
        return trailer.getPrev().getElement();
    }
    public void addBetween(Integer ele,Node<Integer> previous,Node<Integer> next){
        Node<Integer> newele = new Node<Integer>(ele,previous,next);
        previous.setNext(newele);
        next.setPrev(newele);
        size++;
    }
    private void remove(Node<Integer> node)
    {
        Node<Integer> previous = node.getPrev();
        Node<Integer> next = node.getNext();
        size--;
        previous.setNext(next);
        next.setPrev(previous);
        return node.getElement();
        
    }
    public void addFirst(Integer ele){
        addBetween(ele,header,header.getNext());
        
    }
     public void addLast(Integer ele){
        addBetween(ele,trailer,trailer.getPrev());
        
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	
	}
}
