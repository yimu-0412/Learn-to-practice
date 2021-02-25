//自定义二维数组的打印

#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int arr[3][4] = { 0 };
	int i = 0;
	for (i = 0; i < 3; i++)
	{
		int j = 0;
		for (j = 0; j < 4; j++)
		{
			arr[i][j] = i * 4 + j;
		}
	}
	for (i = 0; i < 3; i++)
	{
		int j = 0;
		for (j = 0; j < 4; j++)
		{
			printf("%-2d ", arr[i][j]);
		}
		printf("\n");
	}
	return 0;
}