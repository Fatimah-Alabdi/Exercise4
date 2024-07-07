import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//1.Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2

        /*int array[]={50,-20,0,30,40,60,10};
        int lastIndex = array.length - 1;

            if(array[0]==array[lastIndex]){
                System.out.println("true");


            }
            else
                System.out.println("false");

         */
        //2.Write a Java program to find the numbers greater than the average of the numbers of a given array.

       /* int num[]={1,4,17,7,25,3,100};

        int sum=0;
        float avg=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
            }
        avg=sum/num.length;
        System.out.println("The average of the said array is: " + avg);
        System.out.println("the numbers grater than the average:");
        for (int i=0;i<num.length;i++){
            if(num[i]>avg){
                System.out.println( num[i]);
            }
        }

        */

    //3.Write a Java program to get the larger value between first and last element of an array of integers.

       /* int num[]={20,30,40};
        int max=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }


        }
        System.out.println(max);

        */
        //4.Write a Java program to swap the first and last elements of an array and create a new array.
       /* ArrayList <Integer>numbers = new ArrayList <>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("the origenal array : "+numbers);
        ArrayList <Integer>swp = new ArrayList <>(numbers);

        if (numbers.size() >= 2) {
            int temp = swp.get(0);
            swp.set(0, swp.get(numbers.size() - 1));
            swp.set(numbers.size() - 1, temp);
            System.out.println("the swapped array : "+swp);
        }

        */

        //5. Write a program that places the odd elements of an array before the even elements.

       /* ArrayList<Integer> original = new ArrayList<>();
        original.add(2);
        original.add(3);
        original.add(40);
        original.add(1);
        original.add(5);
        original.add(9);
        original.add(4);
        original.add(10);
        original.add(7);


        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd =new ArrayList<>();
        for (int num : original) {
            if (num % 2 != 0) {
                odd.add(num);
            } else {
                even.add(num);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(odd);
        result.addAll(even);

        System.out.println("Original : " + original);
        System.out.println("Output: " + result);
        
        */

      //  6. Write a program that test the equality of two arrays. [2,3,6,6,4] [2,3,6,6,4]
       /* int array1[]={2,3,6,6,4};
        int array2[]={2,3,6,6,4};
        boolean equal=true;
if(array1.length==array2.length){
    for (int i = 0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
             equal = false;

        }

    }

        }else equal= true;

        System.out.println(equal);

        */
        }




        }




