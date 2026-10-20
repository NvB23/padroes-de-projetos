package builder;

public class ComputadorGamer implements ComputadorInterface {
    private final String modelo;
    private final Computador.TipoMemoria tipoMemoria;
    private final String memoriaRAM;
    private final String processador;
    private final String fonte;
    private final String placaMae;
    private final String placaDeVideo;

    public ComputadorGamer(String modelo,
                           Computador.TipoMemoria tipoMemoria,
                           String memoriaRAM,
                           String processador,
                           String fonte,
                           String placaMae,
                           String placaDeVideo) {
        this.modelo = modelo;
        this.tipoMemoria = tipoMemoria;
        this.memoriaRAM = memoriaRAM;
        this.processador = processador;
        this.fonte = fonte;
        this.placaMae = placaMae;
        this.placaDeVideo = placaDeVideo;
    }

    @Override
    public Computador criar() {
        return new Computador.ComputadorBuilder()
                .setModelo(modelo)
                .setPlacaDeVideo(placaDeVideo)
                .setMemoriaRAM(memoriaRAM)
                .setTipoMemoria(tipoMemoria)
                .setFonte(fonte)
                .setProcessador(processador)
                .setPlacaIntegrada(false)
                .setTemLED(true)
                .setPlacaMae(placaMae)
                .build();
    }

    @Override
    public String toString() {
        return "ComputadorGamer{" +
                "modelo='" + modelo + '\'' +
                ", tipoMemoria=" + tipoMemoria +
                ", memoriaRAM='" + memoriaRAM + '\'' +
                ", processador='" + processador + '\'' +
                ", fonte='" + fonte + '\'' +
                ", placaMae='" + placaMae + '\'' +
                ", placaDeVideo='" + placaDeVideo + '\'' +
                '}';
    }
}
