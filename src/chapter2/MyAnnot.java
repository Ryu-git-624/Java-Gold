package chapter2;

public @interface MyAnnot {
	String str1() default new String("");
	String str2() default "";
	String str3() default null;
}
