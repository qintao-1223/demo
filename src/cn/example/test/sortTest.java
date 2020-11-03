package cn.example.test;

import cn.example.sort.Bubble;
import cn.example.sort.Merge;

import java.util.Arrays;

public class sortTest {
    public static void main(String[] args) {
        Integer arr[]={9,8,4,10,6,7,1,3,2};
        Merge.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
