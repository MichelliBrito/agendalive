# Agenda Live AP
API de Lives construída em Spring Boot com MongoDB utilizada no curso de Angular 9.

## 1. O que precisa para rodar a API?

Utilizar uma IDE que rode projetos Java como:

- [Eclipse](https://www.eclipse.org/downloads/);
- [Netbeans](https://netbeans.org/features/index.html);
- [IntelliJ](https://www.jetbrains.com/pt-br/idea/download/); 
- Outra IDE de sua preferência.

Além da IDE, é aconselhável que você utilize o [Postman](https://www.postman.com/) para realizar requisições POST no projeto para testar se a API está OK.

## 2. Alterações necessárias para rodar a API.

É necessário alterar a base de dados no arquivo `src/main/resources/application.properties`. Descomente as linhas e insira as informações para sua base de dados.
Você pode usar o MongoDB de graça sem precisar instalar na sua máquina local. [Veja mais informações aqui](https://www.mongodb.com/pricing).

## 2. Como usar a API?

### 2.1 Inicializar a API.

Abrir o projeto na IDE de sua preferência e inicializar a API. Faça uma das requisições abaixo no Postman para verificar se está rodando normalmente.

### 2.2 Listar as Lives cadastradas.

Faça uma requisição GET na URL `http://localhost:8080/lives/` trará um JSON com todas as lives cadastradas.
É possível inserir o parâmetro **flag** na URL com as seguintes opções:

- **previous**: Retorna a lista das lives que já aconteceram;
- **next**: Retorna a lista das lives futuras.

Caso não tenha nenhum resultado para exibir, a API retornará 404.

### 2.3 Cadastrar uma nova Live.

Faça uma requisição POST na URL `http://localhost:8080/lives/` com o corpo da requisição no formato abaixo:

```json
{
    "liveName": "INSIRA_O_NOME_DA_LIVE_AQUI",
    "channelName": "INSIRA_O_NOME_DO_CANAL_AQUI",
    "liveDate": "2020-12-29T21:20:00", // Exemplo de data a ser enviada para a API. 
    "liveLink": "INSIRA_O_LINK_EMBED_DA_LIVE_AQUI"
}
````

O retorno da requisição será o JSON com os dados gravados no banco de dados.

## 3. Mais informações

Se você estiver rodando o projeto [agendalive-app](https://github.com/MichelliBrito/agendalive-app) no seu ambiente local, não é necessário realizar nenhuma modificação nesta aplicação para utilizar a API.