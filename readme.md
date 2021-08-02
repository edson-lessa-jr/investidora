# Investidora

Exemplo para programação 1 de orienteação a objetos em JAVA

## Problema

Investidora necessita realilizar o controle de seus produtos de investimento.

Atualmente a investidora possui apenas dois produtos
* Tesouro direto
* Fundo de investimento

A investidora pede que seque seja controlado um cliente que possua as duas
modalidades de investimento e possa realizar transferência de valores entre
as duas.

## Interpretações 

Neste exemplo foi adotado algumas premissas:
* Tesouro direto:
  * Toda a entrada de investimento terá um acrescimento de 4%. Ex: investe R$ 100,00 na conta fica R$ 104,00
  * Todo o resgate de investimento terá uma taxa administrativa de 10%. Ex: resgate de R$ 100,00 será retirado do saldo R$ 110,00
* Fundo de investimento
  * Toda a entrada de investimento terá um acrescimento de 6%. Ex: investe R$ 100,00 na conta fica R$ 106,00
  * Todo o resgate de investimento terá uma taxa administrativa de 35%. Ex: resgate de R$ 100,00 será retirado do saldo R$ 135,00
* Transferência: deverá considerar o valor da taxa administrativa da conta de origem e o valor o percentual de rendimento da conta de destino

### Conceitos utilizados

* Orientação a Objetos
* Polimorfisomo
* Sobrescrita