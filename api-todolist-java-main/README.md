# ToDo List API com Spring Boot e JWT
Este projeto é uma API de lista de tarefas (ToDo List) construída com Spring Boot, utilizando JWT (JSON Web Token) para autenticação e autorização. A API permite o gerenciamento de tarefas de forma segura, associando tarefas a usuários e permitindo a criação, leitura, atualização e exclusão de tarefas.

## Funcionalidades
* Autenticação JWT: A API usa JWT para autenticar usuários e garantir que as tarefas de cada usuário sejam protegidas.
* Registro de Usuário: Permite registrar novos usuários com nome de usuário e senha.
* Login de Usuário: Gera um token JWT após o login bem-sucedido, que deve ser usado para autenticação em rotas protegidas.
* Gerenciamento de Tarefas: CRUD de tarefas (Criar, Ler, Atualizar e Excluir), onde cada tarefa é associada a um usuário.

## Tecnologias Utilizadas
* Spring Boot - Framework para construir aplicações Java com foco em produtividade.
* Spring Security - Implementação de segurança, configurada para usar JWT.
* JWT (JSON Web Token) - Para autenticação e autorização de usuários.
* JPA (Java Persistence API) - Para persistência de dados no banco de dados.
* H2 Database - Banco de dados em memória usado para armazenamento de dados (pode ser substituído por outro banco como MySQL ou PostgreSQL).
* BCrypt - Para criptografar senhas de usuários.

## Como Rodar o Projeto
### Pré-requisitos
* Java 17 ou superior instalado.
* Maven ou Gradle para construção do projeto.
* Postman ou qualquer ferramenta para testar APIs REST.

### 1. Clonando o Repositório
Clone este repositório no seu ambiente local:

```bash
git clone https://github.com/cleosilva/api-todolist-java.git
```
### 2. Instalando as Dependências
Dentro da pasta do projeto, execute:

```bash
mvn install
```
### 3. Executando a Aplicação
Execute a aplicação com o seguinte comando:

```bash
mvn spring-boot:run
````
A aplicação estará rodando em http://localhost:8080.

### 4. Testando a API
#### Registro de Usuário
* Método: POST
* URL: http://localhost:8080/api/auth/register
* Body (JSON):
```json
{
   "username": "novoUsuario",
   "password": "senhaSegura"
}
```
#### Login de Usuário
* Método: POST
* URL: http://localhost:8080/api/auth/login
* Body (JSON):

```json
{
  "username": "novoUsuario",
  "password": "senhaSegura"
}
```` 
* Resposta (Sucesso):

````json
{
"token": "seu-token-jwt-aqui"
}
````
#### Criar uma Tarefa
* Método: POST
* URL: http://localhost:8080/api/tasks
* Headers: Authorization: Bearer <seu-token-jwt-aqui>
* Body (JSON):
````json
{
  "title": "Tarefa de Exemplo",
  "completed": false
}
````
#### Obter Todas as Tarefas
* Método: GET
* URL: http://localhost:8080/api/tasks
* Headers: Authorization: Bearer <seu-token-jwt-aqui>

#### Deletar uma Tarefa
* Método: DELETE
* URL: http://localhost:8080/api/tasks/{id}
* Headers: Authorization: Bearer <seu-token-jwt-aqui>

### 5.Configuração do Banco de Dados
Este projeto usa o H2 Database em memória, o que significa que os dados são descartados quando a aplicação é reiniciada. Se preferir usar um banco de dados persistente, você pode configurar o application.properties para conectar a um banco como MySQL ou PostgreSQL.

### 6. Como Funciona
* Registro de Usuário: O usuário fornece um nome de usuário e uma senha. A senha é criptografada com BCrypt antes de ser salva no banco de dados.
* Login de Usuário: O usuário autentica suas credenciais (nome de usuário e senha) e, se bem-sucedido, um token JWT é gerado e retornado.
* Acesso às Tarefas: O token JWT gerado no login deve ser enviado em todas as requisições subsequentes (como criação, leitura, atualização e exclusão de tarefas) no cabeçalho Authorization.

### 7. Estrutura de Diretórios
* src/main/java/edu/api/todolist/: Código-fonte Java do projeto.
* controller/: Contém os controladores REST (como AuthController e TaskController).
* model/: Contém as entidades JPA (User, Task).
* repository/: Repositórios JPA para acesso ao banco de dados.
* security/: Configurações de segurança, como JWT e Spring Security.
* service/: Lógica de negócios, como autenticação de usuários e gerenciamento de tarefas.
* src/main/resources/: Configurações da aplicação (como application.properties).

### 8. Configuração de Segurança (Spring Security)
* A segurança é configurada para desabilitar CSRF (não necessário para APIs REST).
* A autenticação é feita via JWT, e os endpoints de tarefas exigem que o usuário esteja autenticado com um token válido.
* A sessão é gerenciada de forma stateless (sem estado), o que significa que o servidor não mantém informações sobre o estado do usuário entre as requisições.

## Contribuição
Sinta-se à vontade para fazer contribuições! Caso encontre algum bug ou tenha sugestões de melhorias, por favor, abra uma issue ou envie um pull request.

## Licença
Este projeto é licenciado sob a licença MIT. 