package modifers_Access;

class Test {
    static int x = 10;
    int y = 20;
}

class Test3 {
    public static void main(String[] args) {
        Test t3 = new Test();
        t1.x = 888;
        t1.y = 999;

        Test t3 = new Test();
        System.out.println(t3.x + ".." + t3.y);
    }
}