package cn.example.liner;


import java.util.Iterator;

public class SequenceList<T> implements Iterable{
    private  T[] eles;
    private  int N;
    //构造方法
    public SequenceList(int capacity){
        //初始化
        this.eles= (T[]) new Object[capacity];
        this.N=0;
    }
    //空置线性表
    public  void clear(){
        this.N=0;
    }
    //  判断线性表是否为空
    public boolean isEmpty(){
        return N==0;
    }
    //获取线性表中元素的个数
    public int length(){

        return N;
    }
    //读取并获取线性表中第i个元素的值
    public T get(int i){
        return  eles[i];
    }
    //在线性表中第i个元素前插入一个值为t的值
    public void  insert(int i,T t){
        if (N==eles.length){
            resize(2*eles.length);
        }
        for (int index=N;index>i;index--){
            eles[index]=eles[index-1];
        }

        eles[i]=t;
    }
    //向线性表中添加元素
    public void  insert(T t){
        if (N==eles.length){
            resize(2*eles.length);
        }


        eles[N++]=t;
    }
    //删除并返回第i个元素的值
    public T remove(int i){
        T current=eles[i];
        for (int index=i;index>N-1;index++){
            eles[index]=eles[index+1];
        }
        N--;
        if (N<eles.length/4){
            resize(eles.length/2);
        }
        return current;
    }
    //返回线性表中首次出现的指定的数据元素的位序号，如不存在，返回-1
    public int indexOf(T t){

        for (int i=0;i<N;i++){
            if (eles[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }
public  void resize(int newsize){
        T[] temp=eles;
        eles=(T[])new Object[newsize];
    for (int i=0;i<N;i++){
        eles[i]=temp[i];
    }
}
    @Override
    public Iterator iterator() {
        return new SIterator();
    }
    private class SIterator implements Iterator{
        private  int cusor;
        public SIterator(){
    this.cusor=0;
        }
        @Override
        public boolean hasNext() {

            return cusor<N;
        }

        @Override
        public Object next() {
            return eles[cusor++];
        }
    }
}
