package library;

public class Motocicleta {
    private long idMotocicleta,anoMotocicleta;
    private String modeloMotocicleta,renavamMotocicleta,chassiMotocicleta,placaMotocicleta,corMotocicleta;
    private double valorCompra;

    public Motocicleta(){}

    public Motocicleta(long idMotocicleta, String modeloMotocicleta, String renavamMotocicleta, String chassiMotocicleta, String placaMotocicleta, String corMotocicleta, long anoMotocicleta, double valorCompra) {
        this.idMotocicleta = idMotocicleta;
        this.modeloMotocicleta = modeloMotocicleta;
        this.renavamMotocicleta = renavamMotocicleta;
        this.chassiMotocicleta = chassiMotocicleta;
        this.placaMotocicleta = placaMotocicleta;
        this.corMotocicleta = corMotocicleta;
        this.anoMotocicleta = anoMotocicleta;
        this.valorCompra = valorCompra;
    }
    public long getIdMotocicleta() {
        return idMotocicleta;
    }

    public void setIdMotocicleta(long idMotocicleta) {
        this.idMotocicleta = idMotocicleta;
    }

    public String getModeloMotocicleta() {
        return modeloMotocicleta;
    }

    public void setModeloMotocicleta(String modeloMotocicleta) {
        this.modeloMotocicleta = modeloMotocicleta;
    }

    public String getRenavamMotocicleta() {
        return renavamMotocicleta;
    }

    public void setRenavamMotocicleta(String renavamMotocicleta) {
        this.renavamMotocicleta = renavamMotocicleta;
    }

    public String getChassiMotocicleta() {
        return chassiMotocicleta;
    }

    public void setChassiMotocicleta(String chassiMotocicleta) {
        this.chassiMotocicleta = chassiMotocicleta;
    }

    public String getPlacaMotocicleta() {
        return placaMotocicleta;
    }

    public void setPlacaMotocicleta(String placaMotocicleta) {
        this.placaMotocicleta = placaMotocicleta;
    }

    public String getCorMotocicleta() {
        return corMotocicleta;
    }

    public void setCorMotocicleta(String corMotocicleta) {
        this.corMotocicleta = corMotocicleta;
    }

    public long getAnoMotocicleta() {
        return anoMotocicleta;
    }

    public void setAnoMotocicleta(long anoMotocicleta) {
        this.anoMotocicleta = anoMotocicleta;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "idMotocicleta=" + idMotocicleta +
                ", anoMotocicleta=" + anoMotocicleta +
                ", modeloMotocicleta='" + modeloMotocicleta + '\'' +
                ", renavamMotocicleta='" + renavamMotocicleta + '\'' +
                ", chassiMotocicleta='" + chassiMotocicleta + '\'' +
                ", placaMotocicleta='" + placaMotocicleta + '\'' +
                ", corMotocicleta='" + corMotocicleta + '\'' +
                ", valorCompra=" + valorCompra +
                '}';

}
}
