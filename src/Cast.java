public class Cast {
    public static void main (String[] args) {
        /*
            Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e
            imprima o resultado.
         */
        double valor = 6.66;
        int inteiro = (int) valor;
        System.out.println(inteiro);

        /*
            Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas
            variáveis e concatene-as em uma mensagem.
         */
        char letra;
        String palavra;
        letra = 'A';
        palavra = " Lua!";
        System.out.println(letra + palavra);

        /*
            Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor
            total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
         */
        double precoProduto = 9.90;
        int quantidade = 7;
        double total = precoProduto * quantidade;
        System.out.println(total);

        /*
            Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere
            que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e
            imprima o resultado formatado.
         */
        double valorEmDolares;
        valorEmDolares = 7.89;
        double valorEmReal = valorEmDolares * 4.94;
        String dolarEmReal = String.format("%.2f dólares é igual à %.2f reais!", valorEmDolares, valorEmReal);
        System.out.println(dolarEmReal);

        /*
            Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando
            o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua
            um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais,
            aplique-o ao preço original e imprima o novo preço com desconto.
         */
        double precoOriginal;
        precoOriginal = valorEmReal;
        double percentualDesconto;
        percentualDesconto = 10;
        double desconto = precoOriginal * (percentualDesconto / 100);
        String recibo = String.format("O valor original do produto era R$%.2f e foi descontado %.2f%%, o que equivale à um desconto de R$%.2f.", precoOriginal, percentualDesconto, desconto);
        System.out.println(recibo);
    }
}
