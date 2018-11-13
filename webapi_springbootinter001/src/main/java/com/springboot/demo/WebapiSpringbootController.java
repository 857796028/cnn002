package com.springboot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zgc on 11 : 2018/11/12 0012 : 上午 8:19
 */

@Controller
public class WebapiSpringbootController {

    @ResponseBody
    @RequestMapping(value = "boot")
    public List boot(){
        System.out.println(System.currentTimeMillis());
        ArrayList list = new ArrayList();

       /* for (int i = 2;i<=100;i++){
            if(FindPrimer(i)){
                list.add(i);
            }
        }*/
       //int [] array = new int[]{1,0,12,11,3,8,-4,6,5,3,8,9};
       //QS(array,0,array.length-1);
        //bubbleSort(array);
        for ( int i =0;i< 10;i++){
            int fibonacci = Fibonacci(i);
            list.add(fibonacci);

        }


        //List list1 = CollectionUtils.arrayToList(array);


        return  list;
    }

    public static boolean FindPrimer(int n){
        boolean flag = true;
        int j = (int)Math.sqrt(n);
        for (int i = 2;i<=j;i++){
            if(n % i == 0){
                flag = false;
            }
        }
       return flag;

    }
    public static void QS(int[] array,int start,int end){
        if(start < end){
            int stand = array[start];
            int low = start;
            int high = end;
            while(low <  high ){
                while (low < high && stand <= array[high]){
                    high --;
                }
                array[low] = array[high];
                while (low < high && stand >= array[low]){
                    low ++;
                }
                array[high] = array[low];


            }
            array[low ] = stand;
            QS(array,start,low);
            QS(array,low+1,end);


        }






    }

    public static int Fibonacci(int n){
        if(n <= 0){
       return  1;

        }else {

            return Fibonacci(n-2)+Fibonacci(n-1);
        }

    }

    public static void bubbleSort(int[] array){
        for (int i = 0;i < array.length -1;i++){
            for (int j = 0;j< array.length -1 - i ;j++){
                if (array[j] > array[j+1]) {
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1]= t;

                }

            }

        }




    }



}
