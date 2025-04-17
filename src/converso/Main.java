package converso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static converso.ConsultaMoedaAPI.exibirMenu;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ConsultaMoedaAPI consultaMoedaAPI = new ConsultaMoedaAPI();
        List<HistoricoConversao> historico = new ArrayList<>();

        String baseCode = "";
        String targetCode = "";

        while (true) {
            exibirMenu();

            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 8) {
                System.out.println("Programa encerrado! Obrigado ate a proxima");
                break;
            }
            switch (opcao) {
                case 1:
                    baseCode = "USD";
                    targetCode = "ARS";
                    break;

                case 2:
                    baseCode = "ARS";
                    targetCode = "USD";
                    break;

                case 3:
                    baseCode = "USD";
                    targetCode = "BRL";
                    break;

                case 4:
                    baseCode = "BRL";
                    targetCode = "USD";
                    break;

                case 5:
                    baseCode = "USD";
                    targetCode = "COP";
                    break;

                case 6:
                    baseCode = "COP";
                    targetCode = "USD";
                    break;

                case 7:
                    System.out.println("\nHistorico de conversão:");
                    if(historico.isEmpty()) {
                        System.out.println("Nenhuma conversão feita ainda");
                    } else{
                        for(HistoricoConversao his : historico) {
                            System.out.println(his);
                        }
                    }

                default:
                    System.out.println("Opção invalida, digite uma opção valida");
                    continue;
            }
            System.out.println("Buscando taxa de conversão...");
            Moeda moeda = consultaMoedaAPI.buscarMoeda(baseCode, targetCode);

            System.out.println("Digite o valor para fazer a conversão");
            double valor = sc.nextDouble();

            double valorConvertido = valor * moeda.conversion_rate();

            System.out.println("Resultado da conversão: " +
                    String.format("%.2f", valor) + " " + moeda.base_code() +
                    " => " +
                    String.format("%.2f", valorConvertido) + " " + moeda.target_code());

            HistoricoConversao novaConversao = new HistoricoConversao(baseCode,targetCode,valor, valorConvertido, moeda.conversion_rate());
            historico.add(novaConversao);

            if(historico.size() > 6) {
                historico.remove(0);
            }
        }

    }
}
