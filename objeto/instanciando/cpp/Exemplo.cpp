// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Instanciando objetos em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#include <stdio.h>

class Produto
{
public:
    // Atributos valor e tipo
    float valor;
    char tipo;

    // Método que calcula o valor do imposto
    float valorImposto()
    {
        float i;

        if (valor < 500)
            i = valor * 10/100;
        else
            i = valor * 15/100;

        return i;
    }
};

int main()
{
    Produto p;
    float preco, imp;
    char tipo;

    printf("Digite o preco do produto: ");
    scanf("%f%*c", &preco);
    printf("Digite o tipo do produto: ");
    scanf("%c%*c", &tipo);

    p.valor = preco;
    p.tipo = tipo;

    printf("\nPreco do produto = %5.2f", p.valor);
    printf("\nTipo do produto = %c", p.tipo);

    imp = p.valorImposto();

    printf("\nImposto = %5.2f", imp);
    getchar();

    return 0;
}