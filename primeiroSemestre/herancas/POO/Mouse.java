package POO;

public class Mouse {
    private String nome;
    public double positionX;
    public double positionY;
    public int click;

    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }


    public int getClick() {
        return click;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public void setClick(int click) {
        this.click = click;
    }

    public void cliqueBotaoDireito(int direito){
        this.click += direito;
    }

    public void cliqueBotaoEsquerdo(int esquerdo){
        this.click += esquerdo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void showText() {
        System.out.println("Nome do mouse: " + getNome());
        System.out.println("");
    }

    public void showClick() {
        System.out.println("");
    }

}

