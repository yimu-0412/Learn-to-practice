//strcmp的模拟实现

#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<assert.h>
int my_strcmp(const char* src, const char* dest)
{
	int ret = 0;
	assert(src != NULL); 
	assert(dest != NULL);
	while (!(ret = *(unsigned char*)src - *(unsigned char*)dest) && *dest) 
		++src, ++dest;
	if (ret < 0)
		ret = -1;
	else if (ret > 0)
		ret = 1;
	return(ret);
}
int main()
{
	char arr1[] = "abcde";
	char arr2[] = "aad";
	printf("%d\n", my_strcmp(arr1, arr2));
	return 0;
}