//模拟实现memmove库函数

#define  _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<assert.h>	
#include <string.h>
void* my_memmove(void* dst, const void* src, size_t count)
{
	void* ret = dst;
	if (dst <= src || (char*)dst >= ((char*)src + count))
	{
		//不重叠的缓冲区
		//从低地址复制到高地址
		while (count--) {
			*(char*)dst = *(char*)src;
			dst = (char*)dst + 1;
			src = (char*)src + 1;
		}
	}
	else {
		//重叠的缓冲区
	    //从低地址复制到高地址
		dst = (char*)dst + count - 1;
		src = (char*)src + count - 1;
		while (count--) {
			*(char*)dst = *(char*)src;
			dst = (char*)dst - 1;
			src = (char*)src - 1;
		}
	}
	return(ret);
}
int main()
{
		char str[] = "memmove can be very useful......";
		my_memmove(str +20, str + 15, 1);
		puts(str);
		return 0;
}