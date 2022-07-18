## Enunciado Desafio 1

A partir de uma lista de pessoas (nome e data nascimento no formato dd-MM-yy), calcular a idade de cada pessoa em referência a data de hoje.

A idade maxima das pessoas é de 99 anos.

## Enunciado Desafio 2

Um funcionário recebe uma comissão de 0.5% sobre o valor do seu dia trabalhado.

Criar uma função para receber o valor do salário mensal e o ano e partir dessas informações calcular a previsão do salário mês a mês.

Considerar apenas os dias úteis (segunda a sexta).

## Enunciado Desafio 3

Vai acontecer um evento internacional com transmissão online em São Paulo e Paris.
Começa no dia 20 de Julho às 10h de São Paulo, mas deverá ter uma nova sessão a cada 10 dias.
A cada sessão a hora de início deve avançar 2 horas, comparado com a sessão anterior.
Cada sessão vai durar 6h.
O evento termina no fim de Outubro.
Crie a agenda do evento programaticamente utilizando o Java Time, deverá fornecer:

-A agenda das sessões para cada lugar.
-Com o número da sessão.
-Apresentar a data de cada sessão.
-O horário de início e de fim, para cada lugar respectivamente.
-Apresentar o dia da semana em português.
-Organizar o código em classes e adotar algum padrão de projeto.

## Enunciado Desafio 4

Há um jardim cheio de lírios.
Tem 100 vermelhos, 50 amarelos e 25 azuis, todos bem misturadas, produzindo um efeito bem colorido.
Assuma que o lírio vermelho é o número 1, o amarelo o número 2 e o azul será o número 3.
Inicialize um stream com as sequências onde cada número representa uma flor e misture tudo.
Faça a colheita de todas as flores azuis e de 25% das outras flores.
Apresente o total de flores que sobram no jardim.

Utilize apenas stream, é proibido utilizar arrays e collections.

## Enunciado Desafio 5

Enunciado
Baseado na lista de contatos abaixo, obtenha os nomes de quem possuí o número 7 no seu número de telefone e liste os respectivos nomes em ordem alfabéntica.

Apenas utilizando Stream.

List.of(
Map.of("nome", "João", "telefone", "9329823423"),
Map.of("nome", "Maria", "telefone", "9124235435"),
Map.of("nome", "Marta", "telefone", "9456335387"),
Map.of("nome", "José", "telefone", "9632874738"),
Map.of("nome", "Judas", "telefone", "9329244683")
)

## Lembretes

Desafio1: LocalDate - getYear() , quando entro com 2 digitos, retorna 2000 + os 2 digitos.
