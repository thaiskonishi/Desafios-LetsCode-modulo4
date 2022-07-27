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

Baseado na lista de contatos abaixo, obtenha os nomes de quem possuí o número 7 no seu número de telefone e liste os respectivos nomes em ordem alfabéntica.

Apenas utilizando Stream.

List.of(
Map.of("nome", "João", "telefone", "9329823423"),
Map.of("nome", "Maria", "telefone", "9124235435"),
Map.of("nome", "Marta", "telefone", "9456335387"),
Map.of("nome", "José", "telefone", "9632874738"),
Map.of("nome", "Judas", "telefone", "9329244683")
)


## Enunciado Desafio 6

Uma produção agrícola precisa gerar periodicamente relatórios.
Para já deram apenas como exemplo como pode ser gerado um dos seus relatórios mensais.
Assim os outros relatórios podem ser gerados a partir da mesma implementação deste.
A forma da construção dos relatórios precisa ser dinâmica, onde tem que relacionar a informação em um arquivo de variáveis com um arquivo de modelo.
Processe o arquivo de exemplo de variaveis.txt:

tomate=200
melao=80
laranja=140
desperdicio=5

São apenas variáveis de exemplo, então pode conter outras quaisquer seguindo este mesmo padrão.
E o arquivo de modelo modelo.txt que deve ser processado:

Relatório Mensal <% mes %>/<% ano %>

Neste mês de <%mes%> do ano <%ano%> a produção acumulada até o momento é de:

- <% tomate %> toneladas de TOMATES
- <% melao %> toneladas de MELÃO
- <% laranja %> toneladas de LARANJA

A taxa média de desperdício foi de <%desperdicio%>%.


Há algumas variáveis padrão como de ano e mês, mas pode fazer uso de qualquer outra variáveis des que esteja definida no arquivo de variáveis.
Por fim o relatório final produzido dinamicamente deverá ser assim:

Relatório Mensal julho/2022

Neste mês de julho do ano 2022 a produção acumulada até o momento é de:

- 200 toneladas de TOMATES
- 80 toneladas de MELÃO
- 140 toneladas de LARANJA

A taxa média de desperdício foi de 5%.


Grave o relatório final no arquivo relatorio-<%mes%>.txt e imprima o seu conteúdo no terminal.


## Enunciado Desafio 7

Um site de noticias possui um padrao para os links, sendo ele: site, categoria, subcategoria, data e titulo da noticia.
https://sitenoticas.com.br/negocios/investimentos/2022/04/01/fim-de-semana-com-muita-chuva.html
Crie uma expressao regular para validar se um link inserido é correto.


## Enunciado Desafio 8

A partir de um arquivo TXT posicional com o seguinte conteudo:
https://s3-sa-east-1.amazonaws.com/lcpi/67fdd982-9281-4bb3-bf89-f7c4b157b8f8.txt
Faça a leitura do arquivo (utilizando a api NIO 2) e faça a transformaçao para uma lista de objetos Pessoa (utilizando stream):

class Pessoa {
String nome;
LocalDate dataNascimento;
String cidade;
String uf;
}


## Enunciado Desafio 9

Crie threads para simular o processamento de um pedido.

Apos receber o pedido, o sistema deve executar os seguintes passos:

    Processar o pagamento
    Verificar e bloquear o estoque
    Emitir nota fiscal
    Enviar email para o cliente com a nota fiscal
    Preparar o produto para expediçao
    Avisar a transportadora

** OBRIGATORIAMENTE DEVE SER CRIADA UMA THREAD PARA CADA PASSO DA LISTA **

Utilize processamento paralelo, mas algumas regras deve ser seguidas, por exemplo:

    O bloqueio do estoque nao pode ocorrer antes do pagamento.
    Envio de email da NF nao pode ser executado antes da emissao.
    Avisar a transportadora nao pode ocorrer antes de preparar o produto para expediçao.
    Nota fiscal deve ser emitida logo apos a verificacao do estoque.
    Preparar o produto para expediçao e avisar a transportadora deve ser iniciado logo apos o bloqueio no estoque.

** UTILIZAR APENAS WAIT E NOTIFY PARA GARANTIR O SINCRONISMO **



## Enunciado Desafio 10

Enunciado

Um sistema precisa realizar a exportação de dados a partir de consultas em diversos sistemas.
Simule a criação de 4 consultas a sistemas diversos e a criação de um arquivo contendo os dados de todas as consultas.
As 4 consultas devem ser realizadas paralelamente e após a finalização das consultas um arquivo único deve ser gerado com os dados.
Utilizar a classe ExecutorService para realizar a sincronização do processamento.

## Lembretes

Desafio1: LocalDate - getYear() , quando entro com 2 digitos, retorna 2000 + os 2 digitos.
