#define _CRT_SECURE_NO_WARNINGS 1
#include"game.h"

void Ininboard(char board[ROWS][COLS], int rows, int cols,char set)
{
	int i = 0;
	int j = 0;
	for (i = 0; i < rows; i++)
	{
		for (j = 0; j < cols; j++)
		{
			board[i][j]=set;
		}
	}
}

void Displayboard(char board[ROWS][COLS], int row, int col)
{
	int i = 0;
	int j = 0;
	//打印列号
	for (i = 0; i <= col; i++)
	{
		printf("%d ", i);
	}
	printf("\n");
	for (i = 1; i <= row; i++)
	{
		printf("%d ", i);//打印行号
		for (j = 1; j<= col; j++)
		{
			printf("%c ", board[i][j]);
		}
		printf("\n");
	}
}

void Setmine(char board[ROWS][COLS], int row, int col)
{
	int count = EASY_count;
	while (count != 0)
	{
		int x = rand() % row + 1;
		int y = rand() % col + 1;
		if (board[x][y] == '0')
		{
			board[x][y] = '1';
			count--;
		}
	}
}

int Get_mine_count(char mine[ROWS][COLS], int x, int y)
{
	    return mine[x - 1][y - 1] +
		mine[x - 1][y] +
		mine[x - 1][y + 1] +
		mine[x][y - 1] +
		mine[x][y + 1] +
		mine[x + 1][y - 1] +
		mine[x + 1][y] +
		mine[x + 1][y + 1] - 8*'0';

}



void Findmine(char mine[ROWS][COLS],
	char show[ROWS][COLS],
	int row,
	int col)
{
	int win = 0;
	while (win <= row*col - EASY_count)
	{
		printf("请输入坐标》：");
	    int x = 0;
		int y = 0;
		scanf("%d %d", &x, &y);
		if (x >= 1 && x <= row&&y >= 1 && y <= col)
		{
			if (mine[x][y] == '1')
			{
				printf("很遗憾，你被炸死了\n");
				Displayboard(mine, row, col);
			}
			else
			{
				int count = Get_mine_count(mine, x, y);
				show[x][y] = count + '0';
				Displayboard(show, row, col);
				win++;
			}
			if (win == row*col - EASY_count)
			{
				printf("恭喜你，你赢了\n");
				Displayboard(mine, row, col);
			}
		}
		else
		{
			printf("坐标非法，请重新输入》：");
		}
	}
}