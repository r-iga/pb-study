package main;

import java.util.Scanner;

public class No001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//n件
		int n = Integer.parseInt(sc.nextLine());

		//合計、平均、最大、最小それぞれの値を初期化
		int sum = 0;
		int avg = 0;
		int max = 0;
		int min = 1000000;

		//for文を回し1つずつ取り出してtmpに格納しながら、合計値を計算、max、minと比較
		for(int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(sc.nextLine());
			sum = sum + tmp;
			if(tmp > max) {
				max = tmp;
			}
			if(tmp < min) {
				min = tmp;
			}
		}

		//合計÷件数で平均値を算出(割り切れない場合は考えなくてよい？)
		avg = sum / n ;

		//結果を出力
		System.out.println(sum + " " + avg + " " + max + " " + min);
	}
}
