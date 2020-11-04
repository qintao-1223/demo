package cn.example.test;

import cn.example.liner.SequenceList;

public class SequenceListTest {
    public static void main(String[] args) {
        SequenceList<String> sequenceList=new SequenceList<>(3);
        sequenceList.insert("路飞");
        sequenceList.insert("鸣人");
        sequenceList.insert("tom");
        sequenceList.insert("犬夜叉");
        sequenceList.insert(3,"鲁迅");
        for (Object s : sequenceList) {
            System.out.println(s);
        }
        System.out.println("----------------------------------------------------");
        String getResult=sequenceList.get(3);
        System.out.println("获取的数据是"+getResult);
        String removeResult=sequenceList.remove(0);
        System.out.println("删除的数据是"+removeResult);
        System.out.println(sequenceList.isEmpty());
        System.out.println("线性表中的元素个数"+sequenceList.length());
        sequenceList.clear();
        System.out.println("清空后线性表中的元素个数"+sequenceList.length());


    }
}
