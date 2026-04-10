class InnerClassExample {
    double pi = 3.14;

    // This is explicitly private
    private class PrivateInnerClass {
        void getPI() {
            System.out.println(pi);
        }
    }

    public static void main(String[] args) {
        // 1. Create the Outer class instance
        InnerClassExample outer = new InnerClassExample();

        // 2. Create the Inner class instance using the Outer instance
        // This works here because main is INSIDE InnerClassExample
        PrivateInnerClass inner = outer.new PrivateInnerClass();

        // 3. Call the method
        inner.getPI();
    }
}
