package com.zjf.test01;

/**
 * className:TestMain03
 * package:com.zjf.test01
 * Description:对数组进行大小写转换并且逆序排序
 *
 * @date: 2019/9/25 9:10
 * @Author: ASUS
 */
public class TestMain03 {
    public static void main(String[] args) {
        int[] array = {'a',1,3,'B',4};
        int[] arrReverse = new int[array.length];
        System.out.println(arrReverse.length);
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            arrReverse[j] = array[i];
            j ++;
        }
        StringBuffer sb = new StringBuffer();
        for (int k = 0; k < arrReverse.length; k++) {
            if(arrReverse[k] >= 97 && arrReverse[k] <= 124){
                if(k == arrReverse.length - 1){
                    sb.append(String.valueOf((char)arrReverse[k]).toUpperCase());
                    break;
                }else{
                    sb.append(String.valueOf((char)arrReverse[k]).toUpperCase()).append(",");
                }
            }
            if(arrReverse[k] >= 65 && arrReverse[k] <= 89){
                if(k == arrReverse.length - 1){
                    sb.append(String.valueOf((char)arrReverse[k]).toUpperCase());
                    break;
                }
                else{
                    sb.append(String.valueOf((char)arrReverse[k]).toLowerCase()).append(",");
                }
            }else{
                if(k == arrReverse.length - 1){
                    sb.append(arrReverse[k]);
                    break;
                }else{
                    sb.append(arrReverse[k]).append(",");
                }
            }

        }
        String string = sb.toString();
        System.out.println(string);
    }

}
