# Sistema de Gerenciamento de Alunos

## Descrição

O **Sistema de Gerenciamento de Alunos** é um programa local desenvolvido em **Java 21** que permite o gerenciamento de alunos em uma base de dados **PostgreSQL**. O sistema oferece funcionalidades essenciais como cadastro, consulta, atualização e exclusão de alunos.

## Tecnologias Utilizadas

- **Java 21**
- **PostgreSQL** (Driver JDBC)

## Entidade Principal: Aluno

A entidade **Aluno** possui os seguintes atributos:

- `id` (Identificador único, gerado automaticamente)
- `nome` (Nome do aluno)
- `matricula` (Número de matrícula único)
- `cpf` (Cadastro de Pessoa Física, único por aluno)

## Funcionalidades

- **Cadastrar Aluno**: Permite adicionar um novo aluno ao banco de dados.
- **Atualizar Aluno**: Modifica as informações de um aluno existente.
- **Remover Aluno**: Remove um aluno do sistema.
- **Consultar Aluno**: Busca um aluno pelo ID, matrícula ou CPF.
- **Consultar todos os Aluno**: Lista as informações de todos os alunos.


## Configuração do Banco de Dados

1. Instale o **PostgreSQL** e crie um banco de dados chamado `dbalunos`.
2. Configure as credenciais de acesso no código-fonte:
   ```java
   private static final String URL = "jdbc:postgresql://localhost:5433/dbalunos";
   private static final String USER = "admin";
   private static final String PASSWORD = "admin";
   ```
3. Certifique-se de que o driver **PostgreSQL JDBC** está instalado. Se estiver usando **Maven**, adicione a seguinte dependência ao `pom.xml`:
   ```xml
   <dependency>
       <groupId>org.postgresql</groupId>
       <artifactId>postgresql</artifactId>
       <version>42.6.0</version>
   </dependency>
   ```

## Como Executar

1. Clone este repositório:
   ```sh
   git clone https://github.com/seuusuario/gerenciamento-alunos.git
   ```
2. Acesse o diretório do projeto:
   ```sh
   cd gerenciamento-alunos
   ```
3. Compile e execute o programa:
   ```sh
   mvn clean install
   java -jar target/gerenciamento-alunos.jar
   ```

