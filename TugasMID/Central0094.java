interface A {
    void aaa();
}

interface B extends A {
    public void aaa();
}

class Central0094 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String[] args) {
        Central0094 obj = new Central0094();
        System.out.println("main");
        obj.aaa();
    }
}
