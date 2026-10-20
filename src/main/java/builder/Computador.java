package builder;

public class Computador {
    private String modelo;
    private boolean placaIntegrada;
    private TipoMemoria tipoMemoria;
    private boolean temLED;
    private String memoriaRAM;
    private String processador;
    private String fonte;
    private String placaMae;
    private String placaDeVideo;

    private Computador(ComputadorBuilder builder) {
        modelo = builder.modelo;
        placaIntegrada = builder.placaIntegrada;
        tipoMemoria = builder.tipoMemoria;
        temLED = builder.temLED;
        memoriaRAM = builder.memoriaRAM;
        processador = builder.processador;
        fonte = builder.fonte;
        placaMae = builder.placaMae;
        placaDeVideo = builder.placaDeVideo;
    }

    public static class ComputadorBuilder {
        private String modelo;
        private boolean placaIntegrada;
        private TipoMemoria tipoMemoria;
        private boolean temLED;
        private String memoriaRAM;
        private String processador;
        private String fonte;
        private String placaMae;
        private String placaDeVideo;

        public ComputadorBuilder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public ComputadorBuilder setPlacaIntegrada(boolean placaIntegrada) {
            this.placaIntegrada = placaIntegrada;
            return this;
        }

        public ComputadorBuilder setTipoMemoria(TipoMemoria tipoMemoria) {
            this.tipoMemoria = tipoMemoria;
            return this;
        }

        public ComputadorBuilder setTemLED(boolean temLED) {
            this.temLED = temLED;
            return this;
        }

        public ComputadorBuilder setMemoriaRAM(String memoriaRAM) {
            this.memoriaRAM = memoriaRAM;
            return this;
        }

        public ComputadorBuilder setProcessador(String processador) {
            this.processador = processador;
            return this;
        }

        public ComputadorBuilder setFonte(String fonte) {
            this.fonte = fonte;
            return this;
        }

        public ComputadorBuilder setPlacaMae(String placaMae) {
            this.placaMae = placaMae;
            return this;
        }

        public ComputadorBuilder setPlacaDeVideo(String placaDeVideo) {
            this.placaDeVideo = placaDeVideo;
            return this;
        }

        public Computador build() {
            return new Computador(this);
        }
    }

    public enum TipoMemoria {
        SDD,
        HDD
    }
}
