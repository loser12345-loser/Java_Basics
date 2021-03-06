package o_lambda_表达式;
/*
<1>	lambda表达式：是可推导，可以省略
	1.凡是根据上下文推导出来的内容，都可以省略书写
	2.可省略的条件：
			A.（参数列表）：括号中参数列表的数据类型，可以省略不写
			B.（参数列表）：课号中的参数只有一个，那么类型和（）都可以省略
			C.（一些代码）：如果{}中的代码只有一行，无论是否有返回值，都可以省略（{}，return，分号）
			   注意：要省略{}，return，分号必须一起省略

<2> lambda 的使用前提
	1.使用lambda必须具有接口且要求接口中只有一个抽象方法
	2.无论是jdk内置的Runnable，comparator接口还是自定义的接口，只有抽象方法唯一时才可以使用lambda
	3.使用lambda必须具有上下文推断

	只有一个抽象函数的接口，称为函数式接口
 */
public class a0_lambda的省略_极简式 {
}
