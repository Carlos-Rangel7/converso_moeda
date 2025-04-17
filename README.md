# **Conversor de Moeda**

## **Descrição**

O **Conversor de Moeda** é uma aplicação em Java que permite aos usuários consultar o valor de sua moeda e compará-la com outras. Ele utiliza uma **API externa** (ExchangeRate) para obter os valores de câmbio em tempo real. O projeto foi desenvolvido utilizando **Java 17** e a biblioteca **Gson** para o processamento de dados em formato JSON.

Essa aplicação é útil para quem precisa saber a cotação de diferentes moedas e realizar conversões de maneira simples e rápida.

O sistema possui um menu interativo, implementado com um **loop `while`**, que permite ao usuário repetir as ações até que ele escolha a opção de sair (opção 8). Além disso, o histórico de conversões é armazenado em um **ArrayList**, que mantém um limite de 6 registros; ao ultrapassar esse limite, o primeiro registro é excluído.

## **Tecnologias Usadas**

- **Java 17**: Linguagem principal utilizada para o desenvolvimento da aplicação.
- **Gson**: Biblioteca para manipulação de dados JSON.
- **API Externa (ExchangeRate)**: Fonte de dados para obter as taxas de câmbio em tempo real.
- **IntelliJ IDEA**: Ambiente de desenvolvimento utilizado.

## **Saídas do Código**

### Menu Inicial

O usuário é apresentado a um menu com diversas opções de funcionalidades. Aqui está a tela inicial do menu:

![image](https://github.com/user-attachments/assets/d89245be-726e-47b0-bc36-3e6a6c5433ed)

### Executando a Opção 3

Após selecionar a opção 3, a aplicação realiza a conversão de moedas:

![image](https://github.com/user-attachments/assets/613f64e6-24e8-4ad9-a83b-6ddb297561dc)

### Executando a Opção 4

Ao escolher a opção 4, a aplicação exibe a conversão solicitada para a moeda de destino:

![image](https://github.com/user-attachments/assets/4cf8ace9-c0d3-4962-8ae2-48b35fe6a047)

### Listando o Histórico de Conversões (Opção 7)

Ao selecionar a opção 7, o usuário pode visualizar o histórico das últimas conversões realizadas. O histórico é armazenado em um **ArrayList** com limite de 6 registros, e os registros mais antigos são removidos conforme novas conversões são feitas:

![image](https://github.com/user-attachments/assets/49f69c30-5768-41d9-8aed-b383642166fd)

## **Funcionalidades**

- **Menu interativo**: O menu de opções é repetido até que o usuário escolha a opção 8 para sair. Isso é feito com um **loop `while`**.
- **Histórico de conversões**: O histórico das conversões é armazenado em um **ArrayList**, com limite de 6 conversões. Se o número de conversões exceder esse limite, a primeira conversão é excluída.
- **Consulta de taxas de câmbio em tempo real**: Utiliza a API **ExchangeRate** para obter as taxas de câmbio e realizar as conversões.

