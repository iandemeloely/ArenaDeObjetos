package servicos;

public class ServicosFactory {
    public static VitimaServicos vitimaS = new VitimaServicos();

    public static VitimaServicos getVitimaServicos() {
        return vitimaS;
    }

        public static GuerreiroServicos GuerreiroS = new GuerreiroServicos();
    
        public static GuerreiroServicos getGuerreiroServicos() {
            return GuerreiroS;
        }

        public static LadraoServicos LadraoS = new LadraoServicos();
    
        public static LadraoServicos getLadraoServicos() {
            return LadraoS;
        }

}
