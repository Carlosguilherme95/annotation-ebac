import java.lang.annotation.Annotation;
public class Exemplo {
        public static void main(String[] args) {
            Class<?> classeCliente = Cliente.class;
            Tabela tabelaAnnotation = classeCliente.getAnnotation(Tabela.class);

            if (tabelaAnnotation != null) {
                String nomeDaTabela = tabelaAnnotation.nome();
                System.out.println("Nome da Tabela: " + nomeDaTabela);
            } else {
                System.out.println("A annotation Tabela não está presente.");
            }
        }
    }


