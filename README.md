# nassauTickets 

> **Sistema de Controle de Atendimento para Laboratório de Análises Clínicas**
> 
> Projeto acadêmico desenvolvido para a disciplina de Desenvolvimento Web da UNINASSAU.

---

##  Descrição e Objetivo

O **nassauTickets** é uma solução web desenvolvida para gerenciar, ordenar e otimizar o fluxo de atendimento em um Laboratório de Análises Clínicas. O sistema abrange a organização de senhas por meio de totems de autoatendimento até o controle de filas pelos atendentes, exibição pública de chamadas em painéis e geração de relatórios detalhados de auditoria e desempenho.

O objetivo do projeto é consolidar conhecimentos práticos em desenvolvimento web moderno, arquitetura de software, integração com APIs REST, manipulação de estados em **React**, organização colaborativa no **GitHub** e documentação estruturada.

---

##  Membros

| Nome | Matrícula | Papel |
| :--- | :--- | :--- |
| Fagner Célio Pereira Barreto | 01465577 | **Desenvolvedor** |
| Guilherme José Bezerra Coutinho | 01909302 | **Testador** |
| Heron Bezerra de Melo Santos | 01900978 | **Documentador** |
| Pedro Sayão Valença e Souza | 01897758 | **Scrum Master / Documentador** |
| Polyana Fernanda da Silva Alves | 01809854 | **Testador** |
| Yohanna Vitória Carneiro dos Santos | 01910666 | **Desenvolvedor** |


---

##  Tecnologias Utilizadas

### Frontend
- **React 19** 
- **JavaScript (ES6+)** / **JSX**
- **HTML5 & CSS3** 
- **Vite**
- **Comunicação: API Fetch / Axios (Consumo de APIs REST JSON)**

### Backend & Banco de Dados
- **Node.js 22 LTS com Express** 
- **MySQL 8.0**
- **Java com Spring Boot**

### Ferramentas & Versionamento
- **Git & GitHub** 
- **Visual Studio Code**

---

##  Arquitetura e Estrutura do Repositório

O projeto segue estritamente a estrutura obrigatória de diretórios exigida no repositório:


nassauTickets/
├── backend/          # API REST em JAVA / Spring Boot e regras de negócio
├── docs/             # Documentação técnica e artefatos
│   ├── branding/     # Identidade visual, logos e paleta de cores
│   ├── mer/          # Modelo Entidade-Relacionamento do MySQL
│   ├── mockups/      # Protótipos das telas (Totem, Painel e Guichê)
│   ├── models/       # Modelos do sistema
│   │   └── uml/      # Diagramas UML e Máquina de Estados da Senha
│   └── requirements/ # Requisitos (RF, RNF, Regras de Negócio, LGPD, Acessibilidade)
├── frontend/         # Aplicação React executável (Vite)
├── .gitignore        # Padrão Node.js (ignora node_modules, .env, etc.)
├── LICENSE           # Licença MIT
└── README.md         # Documentação principal
