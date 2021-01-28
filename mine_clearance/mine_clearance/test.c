#define _CRT_SECURE_NO_WARNINGS	1

#include"game.h"


menu()
{
	printf("************************\n");
	printf("*******  1.play  *******\n");
	printf("*******  2.exit  *******\n");
	printf("************************\n");
}
void game()
{
	//雷信息存储
	//1.布置好雷信息存储
	char mine[ROWS][COLS] = { 0 };
	//2.排查雷信息存储
	char show[ROWS][COLS] = { 0 };
	//初始化
	Ininboard(mine, ROWS, COLS,'0');
	Ininboard(show, ROWS, COLS,'*');
	//打印棋盘
	/*Displayboard(mine, ROW, COL);*/
	Displayboard(show, ROW, COL);
	//布置雷
	Setmine(mine, ROW, COL);
	//Displayboard(mine, ROW, COL);//显示雷的位置

	//排查雷
	Findmine(mine,show, ROW, COL);
	
}

void test()
{
	int input = 0;
	srand((unsigned int)time(NULL));//随机布雷
	do
	{
		menu();
		printf("请选择:>");
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			game();
			break;
		case 0:
			printf("退出游戏\n");
			break;
		default:
			printf("选择错误，请重新选择\n");
			break;
		}

	} while (input);
}
int main()
{
		test();
	return 0;
}