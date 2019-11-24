package com.zjf.test03;

/**
 * className:MyLink
 * package:com.zjf.test03
 * Description:单向链表的简单实现
 *
 * @date: 2019/11/10 9:38
 * @Author: ASUS
 */
public class MyLink<T> {
    private Node head;//头结点
    private Node tail;//尾结点
    private int size;//元素个数

    /**
     * 结点内部类：包括数据、下个节点的信息
     */
    private class Node{
        private T t;
        private Node next;

        public Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }

        public Node(T t) {
            this.t = t;
        }

        public Node() {
        }
    }

    //链表头元素的添加
    public void addHead(T t){
        Node node = new Node(t,null);
        node.next = this.head;
        this.head = node;
        this.size ++;
    }

    //链表尾部元素的添加
    public void addTail(T t){
        Node node = new Node(t);
        node.next = null;
        this.tail = node;
        size ++;
    }

    //链表中间元素的添加
    public void add(T t,int index){
        if(index < 0 | index > size){
            throw new  IllegalArgumentException("index is error");
        }
        if(index == 0){
            this.addHead(t);
        }
        //要找到要插入位置的前一个结点（从第一个结点开始找）
        Node preNode = this.head;
        for(int i = 0;i < index - 1;i ++){
            preNode = preNode.next;
        }
        Node addNode = new Node(t,preNode.next);
        preNode.next = addNode;
        this.size ++;


    }

    //链表元素的删除
    public void delete(int index){
        //删除头元素
        if(this.head == null){
            System.out.println("无元素可删");
            return;
        } else if(index == 0){
            head = this.head.next;
            this.size --;
        }else if(index == this.size - 1){//删除尾元素
            for(int i = 0;i < index - 1;i ++){
                Node preNode = new Node();
            }
        }
    }
}





