/*
*  题目：从键盘读入学生成绩，找出最高分，并输出学生等级。
*    成绩 >= 最高分-10  等级为“A”
*    成绩 >= 最高分-10  等级为“A”
*    成绩 >= 最高分-20  等级为“B”
*    成绩 >= 最高分-30  等级为“C”
*    其余  等级为“D”
*
*
*    请输入学生人数5 
*    请输入5个成绩
*    66 74 89 41 89
*    最高分89
 */

import java.util.Scanner;
public class GradePrint{
	public static void main(String[] args){
		//1.使用Scanner，读取学生个数
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生人数：");
		int number =  scan.nextInt();
		//2.创建数组，存储学生成绩，动态初始化
		int[] scores = new int[number];
		//3.给数组中的元素赋值
		System.out.println("请输入" + number + "个学习成绩");
		int maxScore = 0;
		for(int i = 0;i < scores.length;i ++){
			scores[i] =  scan.nextInt();
			//4.获取数组中元素的最大值
			if(maxScore < scores[i]){
				maxScore = scores[i];
		    }
		}
		//5.根据每个学生成绩和足高分的差值，得到每个学生的等级，并输出等级和成绩	
        char level ;
        for(int i = 0;i < scores.length;i ++){
			if(maxScore - scores[i] <= 10){
				level = 'A';
			}else if(maxScore - scores[i] <= 20){
				level = 'B';
			}else if(maxScore - scores[i] <= 30){
				level = 'C';
			}else{
				level = 'D';
			}


			System.out.println("student " + i  + "  score is  " + scores[i] + 
				", grade is " + level);
        }
	}
}