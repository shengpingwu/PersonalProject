// GoogleTestPrueba.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include "gtest\gtest.h"

int suma(int i, int y)
{
	return i + y; 
}
TEST(sumaTest, Positive)
{
	EXPECT_EQ(2, suma(1, 1));
}

/*
int _tmain(int argc, _TCHAR* argv[])
{
	::testing::InitGoogleTest(&argc, argv);

	RUN_ALL_TESTS();

	return 0;
}

*/
