📬 Contato </br>
📧 Email: simones.fabio1994@gmail.com </br>
💼 LinkedIn: Fábio Simones </br>
🐙 GitHub: https://github.com/FabioSimones </br>
🐙 GitHub do projeto usuário: https://github.com/FabioSimones/usuario </br>

# 🗓️ Microsserviço de Agendamento de Tarefas

Este projeto faz parte de uma **série de microsserviços** voltados para o desenvolvimento de um **agendador de tarefas**.  
O objetivo é permitir que o usuário se cadastre e agende tarefas, recebendo um **aviso por e-mail com 1 hora de antecedência** para ser lembrado.

> ⚙️ Esta parte do projeto trata **exclusivamente** do módulo de **agendamento de tarefas**.

---

## 📌 Método de Desenvolvimento

O método ágil utilizado será **Kanban**.  

📋 **Fluxo de trabalho**:
1. Criação de um **quadro Kanban** com todas as tarefas.
2. Movimentação das tarefas conforme concluídas.
3. Visualização clara do status e progresso do projeto.

🔹 As tarefas inicialmente estarão na aba **Refinamento**, abrangendo não apenas a criação da API do agendador, mas todo o projeto dividido em módulos.

---

## 🛠️ Roteiro do Agendamento de Tarefas

Ao cadastrar uma tarefa, será possível **expandir e detalhar subtarefas** que servirão como roteiro para o desenvolvimento.

Exemplo de fluxo:
- 📌 Criar endpoint de cadastro.
- ✏️ Implementar edição de tarefa.
- 🗑️ Implementar exclusão.
- 📄 Implementar listagem.
- 📧 Implementar notificação por e-mail.

> Como o **Kanban** é flexível, novas tarefas podem ser adicionadas facilmente durante o desenvolvimento.

<img width="530" height="738" alt="image" src="https://github.com/user-attachments/assets/3ce5c7b3-0936-47ad-9f39-7da3b73409d5" />

---

## 💻 Tecnologias Utilizadas

**Desenvolvimento e Testes**
- IntelliJ IDEA 🖥️
- Postman 📬
- Docker 🐳
- Beekeeper Studio 🐝
- MongoDB 🍃

**Organização e Estruturação**
- Miro 🎯
- Trello 📌

---

## 🗺️ Arquitetura e Diagramas

Antes do código, foi desenhada a arquitetura no **Miro** para visualizar melhor o sistema e suas integrações:

- **Start (Frontend)** → Interface inicial.
- **BFF (Backend For Frontend)** → Intermediário entre o Frontend e os microsserviços, otimizando comunicação e dados.
- **Cron** → Agendador de execução periódica.
- **Security** → Controle de autenticação e geração de tokens.
- **Serviço de Agendamento** → Cadastro, alteração, exibição e exclusão de agendamentos (necessita login).
<img width="1095" height="656" alt="image" src="https://github.com/user-attachments/assets/b3dbe743-683e-45ac-beab-1069e087ab83" />


---

## ⚙️ Configuração do Projeto

O projeto foi criado utilizando o [Spring Initializr](https://start.spring.io/), configurando as dependências necessárias.
<img width="1494" height="619" alt="image" src="https://github.com/user-attachments/assets/670ecb88-1d65-4910-9f13-41512f6bead3" />


**Banco de Dados**
- Banco utilizado: **MongoDB**.
- Executado via **Docker** para facilitar estudos e práticas.
- Porta de execução alterada para evitar conflitos:

<img width="406" height="240" alt="image" src="https://github.com/user-attachments/assets/fe966d03-a16d-4694-8fc9-98d5e2a430a5" />
<img width="493" height="446" alt="image" src="https://github.com/user-attachments/assets/88f24ba9-c402-42f9-9d0a-95a7f01af378" />

💡 Ao executar o comando: docker compose up, teremos dois bancos de dados rodando simultaneamente, permitindo testes diretos no Postman.

<img width="393" height="164" alt="image" src="https://github.com/user-attachments/assets/efe5c426-0383-42ac-8ef7-99ccb34393db" />

---


