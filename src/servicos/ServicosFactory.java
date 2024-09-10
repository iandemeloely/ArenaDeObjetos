package servicos;

public class ServicosFactory {
    public static VitimaServicos vitimaS = new VitimaServicos();

    public static VitimaServicos getVitimaServicos() {
        return vitimaS;
    }

}
