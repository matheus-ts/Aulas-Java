import oshi.*;

public class App {
    private static SystemInfo si = new SystemInfo();
    public static void main(String[] args) {

        System.out.println(si.getHardware().getMemory().getAvailable());
        System.out.println(si.getOperatingSystem().getManufacturer());
        System.out.println(si.getOperatingSystem().getFamily());
    }
}
//Ideias para o projeto
