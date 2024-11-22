// Classe principal para simular o histórico de navegação
public class Principal {
    public static void main(String[] args) {
        // Criar uma nova lista duplamente encadeada
        ListaDuplamenteEncadeada historico = new ListaDuplamenteEncadeada();

        // Adiciona as 10 páginas iniciais ao histórico
        historico.inserir("www.google.com");
        historico.inserir("www.facebook.com");
        historico.inserir("www.youtube.com");
        historico.inserir("www.twitter.com");
        historico.inserir("www.instagram.com");
        historico.inserir("www.chatgpt.com");
        historico.inserir("www.github.com");
        historico.inserir("www.stackoverflow.com");
        historico.inserir("www.reddit.com");
        historico.inserir("www.wikipedia.org");

        // Testes de interação com o histórico
        System.out.println("\nHistórico Inicial:");
        historico.listar();

        System.out.println("\nRemovendo uma página...");
        historico.remover("www.reddit.com");

        System.out.println("\nAdicionando uma nova página...");
        historico.inserir("www.medium.com");

        System.out.println("\nHistórico Atualizado:");
        historico.listar();
    }
}