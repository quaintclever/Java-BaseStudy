package com.quaint.sp.javabase.type;

/**
 * Description:
 * @author qi cong
 * @date Created in 2019/11/19 14:14
 */
public class TraversingEnumTest {

    public static void main(String[] args) {

        for (EnumTest e:EnumTest.values()) {
            System.out.println(e);
            System.out.println(e.getVal());
            System.out.println(e.getCode());
            System.out.println(e.getName());
            System.out.println("-------");
        }

    }

}