//strcat模拟实现

#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
#include<assert.h>
char* my_strcat(char* dest, const char* src)
{
	char* ret = dest;
	assert(dest != NULL);
	assert(src != NULL);
	//寻找'\0'
	while (*dest)
	{
		dest++;
	}
	//追加
	while ((*dest++ = *src++))
	{
		;
	}
	return ret;
}
int main()
{
	char arr1[20] = "hello ";
	char arr2[] = "world";
	printf("%s\n", my_strcat(arr1, arr2));
	return 0;
}