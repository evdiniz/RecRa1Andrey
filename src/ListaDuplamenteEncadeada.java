// Classe que implementa a lista duplamente encadeada
class ListaDuplamenteEncadeada {
    private No inicio; // Primeiro nó da lista
    private No fim; // Último nó da lista

    // Construtor para inicializar uma lista vazia
    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    // Método para inserir um novo endereço no final da lista
    public void inserir(String endereco) {
        No novoNo = new No(endereco);

        if (inicio == null) { // Caso a lista esteja vazia
            inicio = novoNo;
            fim = novoNo;
        } else { // Adiciona ao final da lista
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        System.out.println("Página adicionada: " + endereco);
    }

    // Método para remover um endereço específico da lista
    public void remover(String endereco) {
        if (inicio == null) {
            System.out.println("O histórico está vazio.");
            return;
        }

        No atual = inicio;

        while (atual != null) {
            if (atual.dado.equals(endereco)) {
                if (atual == inicio) { // Remoção no início
                    inicio = atual.proximo;
                    if (inicio != null) inicio.anterior = null;
                } else if (atual == fim) { // Remoção no fim
                    fim = atual.anterior;
                    fim.proximo = null;
                } else { // Remoção no meio
                    atual.anterior.proximo = atual.proximo;
                    atual.proximo.anterior = atual.anterior;
                }
                System.out.println("Página removida: " + endereco);
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("Página não encontrada: " + endereco);
    }

    // Método para listar todos os endereços do histórico
    public void listar() {
        if (inicio == null) {
            System.out.println("O histórico está vazio.");
            return;
        }

        No atual = inicio;
        System.out.println("Histórico de Navegação:");
        while (atual != null) {
            System.out.println("- " + atual.dado);
            atual = atual.proximo;
        }
    }
}