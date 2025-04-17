package converso;

public record HistoricoConversao(String baseCode, String targetCode, double valorOriginal, double valorConvertido, double taxaConversao) {

    @Override
    public String toString() {
        return String.format("%.2f", valorOriginal)
                + " " + baseCode
                + " = "
                + String.format("%.2f", valorConvertido )
                + " " + targetCode
                + " (Taxa de conversão: "
                + String.format("%.2f", taxaConversao)
                + ")";
    }
}
