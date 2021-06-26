package POO;

class MouseOptico extends Mouse {

    public double VidaUtil = 1000;
    public Boolean conectado;

    public double getVidaUtil() {
        return VidaUtil;
    }

    public void conectar() {
        this.conectado = true;
    }

    public void desconectar() {
        this.conectado = false;
    }
}

class MouseWireless extends Mouse {

    public double VidaUtil = 1000;
    public int Bateria = 100;
    public Boolean conectado;

    public void conectar() {
        this.conectado = true;
    }

    public void desconectar() {
        this.conectado = false;
    }

    public void status() {
        System.out.println("O mouse esta: " + conectado);
    }

}

class MouseBluetooth extends Mouse {

    public double VidaUtil = 1000;
    public int Bateria = 100;
    public Boolean conectado;

    public void conectar() {
        this.conectado = true;
    }

    public void desconectar() {
        this.conectado = false;
    }

}