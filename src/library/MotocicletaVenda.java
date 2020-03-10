package library;

public class MotocicletaVenda extends Motocicleta {
    private long idVendaMotocicleta;
    private String nomeVendedor;
    private double valorGasto;
    private double valorVenda;

    public MotocicletaVenda(long idMotocicleta, String modeloMotocicleta, String renavamMotocicleta, String chassiMotocicleta, String placaMotocicleta, String corMotocicleta, String anoMotocicleta, double valorCompra){
        super();
        this.idVendaMotocicleta = idVendaMotocicleta;
        this.nomeVendedor = nomeVendedor;
        this.valorGasto = valorGasto;
        this.valorVenda = valorVenda;
    }

    public long getIdVendaMotocicleta() {
        return idVendaMotocicleta;
    }

    public void setIdVendaMotocicleta(long idVendaMotocicleta) {
        this.idVendaMotocicleta = idVendaMotocicleta;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(double valorGasto) {
        this.valorGasto = valorGasto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
}
