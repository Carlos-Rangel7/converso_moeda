package converso;

public record Moeda(String base_code,
                    String target_code,
                    double conversion_rate,
                    String time_last_update ) {
}
