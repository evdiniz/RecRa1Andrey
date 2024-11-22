// Classe que representa um nó na lista duplamente encadeada
class No {
    String dado; // Endereço da página
    No anterior; // Referência para o nó anterior
    No proximo; // Referência para o próximo nó

    // Construtor que define o valor do nó
    public No(String dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}