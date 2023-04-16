package oca.chapter4;

public interface MyInterfaceArray {
}

class MyClass1 implements MyInterfaceArray{}
class MyClass2 implements MyInterfaceArray{}

class Test{
        MyInterfaceArray[] interfaceArrays = {new MyClass1(), null,
        new MyClass2()};
}

class ObjectArray{
        Object[] objects = {null, new Integer[27], new String[2], "hi", new java.util.Date(), new Car()};

        public static void main(String[] args) {
                String name = "eli";
                System.out.println(name.length());
                int[] num = {9888, 78};
                System.out.println(num.length);
        }

}
