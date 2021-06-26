package POO;

public class Main {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        MouseBluetooth mb = new MouseBluetooth();
        MouseOptico mo = new MouseOptico();
        MouseWireless mw = new MouseWireless();

        mo.setNome("Multilaser");
        mb.setNome("Logitech");
        mw.setNome("Razer");
        mw.conectado = false;

        mo.showText();
        mb.showText();
        mw.showText();
        mw.status();
    }


}

