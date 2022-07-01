package Ls20;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ls20 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Test2");
        Scanner scan = new Scanner(file);
        String line = scan.nextLine();
        String[] nums = line.split(" ");
        int [] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            res[i] = Integer.parseInt(nums[i]);
        }
        System.out.println(Arrays.toString(res));
        scan.close();
    }
}

