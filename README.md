# 📦 Workshop Spring Boot 3 com JPA / Hibernate

Projeto de Web Services com Java, Spring Boot e JPA/Hibernate, com foco na construção de um sistema de pedidos com funcionalidades completas de CRUD e relacionamentos entre entidades.

---

## 🎯 Objetivos do Projeto

- Criar um projeto Spring Boot com Java  
- Modelar o domínio baseado em um diagrama ER  
- Implementar as camadas:  
  - `resource` (controladores REST)  
  - `service` (lógica de negócio)  
  - `repository` (acesso a dados com Spring Data JPA)  
- Configurar banco de dados de teste `H2`  
- Povoar o banco de dados com dados iniciais  
- Realizar operações de CRUD (Create, Retrieve, Update, Delete)  
- Implementar tratamento de exceções personalizado  

---

## 🗃️ Modelo de Domínio

O sistema gerencia os seguintes recursos:

- **User** (usuário)  
- **Order** (pedido)  
- **Product** (produto)  
- **Category** (categoria)  
- **OrderItem** (itens de pedidos)  
- **Payment** (pagamento)  

### 🧩 Relacionamentos

- Um `User` pode ter vários `Order`  
- Um `Order` possui vários `OrderItem`  
- Um `OrderItem` associa `Product` e `Order`  
- Um `Product` pode ter várias `Category` (relação muitos-para-muitos)  
- Um `Order` pode ter um `Payment` (relação 1:1)  
- O `OrderStatus` é um enum com os status do pedido  

---

## 🛠️ Tecnologias Utilizadas

- Java 17+  
- Spring Boot 3  
- Spring Data JPA  
- H2 Database (memória)  
- Maven  
- Postman (para testes de API REST)  

---

## ⚙️ Como Executar o Projeto

### Pré-requisitos:

- Java 17 ou superior instalado  
- Maven instalado  

### Passos:

```bash
# Clonar o repositório
git clone https://github.com/seuusuario/seurepositorio.git

# Entrar na pasta do projeto
cd seurepositorio

# Executar o projeto com Maven
./mvnw spring-boot:run
````

---

## 🚀 Endpoints Principais

* `GET /users` - listar usuários
* `GET /orders` - listar pedidos
* `POST /orders` - criar pedido
* `PUT /orders/{id}` - atualizar pedido
* `DELETE /orders/{id}` - deletar pedido
  *(Detalhe os endpoints conforme seu projeto)*

---

## 📁 Estrutura do Projeto

```bash
src/
├── main/
│   ├── java/com/seuusuario/seuprojeto/
│   │   ├── resource/       # Controllers REST  
│   │   ├── service/        # Lógica de negócio  
│   │   ├── repository/     # Acesso a dados  
│   │   ├── model/          # Entidades JPA  
│   │   └── exception/      # Tratamento de exceções  
│   └── resources/
│       └── application.properties
```
Quer que eu adapte esse README para um nome ou detalhes específicos do seu projeto?
```
