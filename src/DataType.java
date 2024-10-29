public class DataType {

    public static void main(String[] args) {

        Sample instanceVariable1 = new Sample();
        Sample instanceVariable2 = new Sample();

        instanceVariable1.memberVariable = 10;
        instanceVariable2.memberVariable = 20;
        Sample.classVariable = 20;
        instanceVariable1.sampleMethod(10);
        instanceVariable2.sampleMethod(10);
        System.out.println("instanceVariable1: " + instanceVariable1.memberVariable);
        System.out.println("instanceVariable2: " + instanceVariable2.memberVariable);
        Sample.classVariable = 30;
        instanceVariable1.sampleMethod(10);
        instanceVariable2.sampleMethod(10);
        instanceVariable1.memberVariable = 17;
        System.out.println("instanceVariable1: " + instanceVariable1.memberVariable);
        System.out.println("instanceVariable2: " + instanceVariable2.memberVariable);


        int a = 1;
        long b = 1;
        float c = 0.1F;
        double d = 0.1F;
        boolean e = true;

        char cat1 = 'c';
        char cat2 = 'a';
        char cat3 = 't';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.print(cat1);
        System.out.print(cat2);
        System.out.print(cat3);
    }
}

