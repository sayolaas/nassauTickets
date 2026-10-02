# Especificação de Requisitos - nassauTickets

## 1. Requisitos Funcionais (RF)

- **[RF01] Emissão Anonimizada de Senhas (Totem):** O sistema deve permitir que um cliente escolha o tipo de atendimento (`SP`, `SE` ou `SG`) sem solicitar dados pessoais.
- **[RF02] Chamada de Senhas (Guichê):** O atendente deve visualizar a fila e clicar em "Chamar Próxima Senha", respeitando a regra de prioridades.
- **[RF03] Rechamada de Senha:** O atendente deve possuir o botão "Chamar Novamente". Na segunda chamada, a interface deve exibir/alertar "Última chamada".
- **[RF04] Painel de Visualização (TV):** O painel deve exibir em destaque a última senha chamada e o histórico das 5 últimas senhas chamadas.
- **[RF05] Alerta Sonoro e Visual:** O painel deve emitir um sinal sonoro (campainha/mídia) e piscar a tela ao chamar uma nova senha.
- **[RF06] Gestão de Atendimento:** O atendente deve registrar o início e a finalização de cada atendimento para computar métricas de tempo.
- **[RF07] Autenticação de Atendentes/Gestores:** Acesso restrito via login e senha para gerenciar o painel e relatórios.

## 2. Requisitos Não Funcionais (RNF)

- **[RNF01] Acessibilidade:** O painel e o totem devem possuir alto contraste, fontes visíveis à distância e suporte a leitor/alerta sonoro.
- **[RNF02] Conformidade com LGPD:** NENHUM dado sensível de paciente/cliente deve ser armazenado ou exibido no Totem ou Painel público.
- **[RNF03] Tempo de Resposta:** A atualização no Painel após a chamada no Atendente deve ocorrer em menos de 1 segundo (tempo real).
- **[RNF04] Concorrência:** O sistema deve tratar requisições simultâneas para garantir que dois guichês não chamem a mesma senha ao mesmo tempo.
- **[RNF05] Resiliência:** Caso haja queda de conexão temporária, a interface do painel deve reconectar automaticamente sem perder a senha atual.