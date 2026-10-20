package builder;

public class ComputadorNormal implements ComputadorInterface {
    private final String modelo;
    private final Computador.TipoMemoria tipoMemoria;
    private final String memoriaRAM;
    private final String processador;
    private final String fonte;
    private final String placaMae;
    private final String placaDeVideo;

    public ComputadorNormal(String modelo,
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
                .setPlacaIntegrada(true)
                .setTemLED(false)
                .setPlacaMae(placaMae)
                .build();
    }

    @Override
    public String toString() {
        return "ComputadorNormal{" +
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
