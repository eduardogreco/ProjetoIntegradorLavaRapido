package beans;

public class Palpite {

    private String campeao;
    private String vice;
    private int id_usuario;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the campeao
     */
    public String getCampeao() {
        return campeao;
    }

    /**
     * @param campeao the campeao to set
     */
    public void setCampeao(String campeao) {
        this.campeao = campeao;
    }

    /**
     * @return the vice
     */
    public String getVice() {
        return vice;
    }

    /**
     * @param vice the vice to set
     */
    public void setVice(String vice) {
        this.vice = vice;
    }
}