# Expense Manager ☕

Aplicação desktop simples para **gerenciamento de despesas pessoais**, desenvolvida em **Java** com **JavaFX** e **Maven**.  
O objetivo do projeto é praticar arquitetura em camadas, Java moderno e construção de interfaces gráficas.

---

## 🎯 Objetivo do Projeto
- Registrar despesas com descrição, valor, categoria e data
- Servir como projeto de estudo e evolução em Java
- Consolidar uso de Maven, JavaFX e boas práticas de organização

---

## 🧱 Arquitetura
O projeto segue uma separação clara de responsabilidades:
src/main/java
├── controller # Lógica de controle da aplicação
├── model # Entidades do domínio (Expense)
├── service # Regras de negócio
├── view # Interface JavaFX
└── Main.java # Classe principal (JavaFX Application)


---

## 🖥️ Interface Atual
- Campo de descrição
- Campo de valor
- Seleção de categoria
- Seleção de data
- Botão para adicionar despesa

*(A listagem e persistência das despesas serão implementadas nas próximas etapas)*

---

## 🚀 Tecnologias Utilizadas
- **Java 21**
- **JavaFX**
- **Maven**
- **IntelliJ IDEA**
- **Linux (Ubuntu)**

---

## ▶️ Como executar o projeto

### Pré-requisitos
- Java 21+
- Maven
- JavaFX instalado no sistema

### Executar com Maven
```bash
mvn clean javafx:run

📌 Status do Projeto

🟡 Em desenvolvimento

 Estrutura Maven

 JavaFX configurado

 Formulário inicial de despesas

 Validações

 Listagem de despesas

 Persistência em arquivo ou banco

 Relatórios

📚 Aprendizados

Este projeto é usado para praticar:

Java orientado a objetos

Organização de projetos reais

JavaFX na prática

Controle de versões com Git