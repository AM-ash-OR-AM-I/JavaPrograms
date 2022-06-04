class Practical {
    public static void main(String[] args) {
        // P test = new P();

    }
    
}

class P{
    int age;
    private P(){
        age=5;
    }
    public static void main(String[] args) {
        P p = new P();
        System.out.println(p.age);
    }
}
