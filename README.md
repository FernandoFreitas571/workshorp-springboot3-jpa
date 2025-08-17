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
