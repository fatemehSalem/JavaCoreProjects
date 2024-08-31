public class BuilderDesignPatternExample {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setCPU("Intel i7")
                .setGPU("NVIDIA GTX 3080")
                .setRAM(16)
                .build();
    }

}
