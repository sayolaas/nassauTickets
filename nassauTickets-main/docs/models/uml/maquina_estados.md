# Diagrama de Máquina de Estados da Senha

```mermaid
stateDiagram-v2
    [*] --> EMITIDA : Cliente retira a senha no Totem
    EMITIDA --> AGUARDANDO : Entra na fila do banco de dados
    AGUARDANDO --> CHAMADA : Atendente clica em "Chamar Próxima"

    CHAMADA --> CHAMADA_NOVAMENTE : Cliente não aparece (1ª rechamada)
    CHAMADA --> EM_ATENDIMENTO : Cliente comparece ao guichê

    CHAMADA_NOVAMENTE --> EM_ATENDIMENTO : Cliente comparece
    CHAMADA_NOVAMENTE --> NAO_COMPARECEU : Cliente ausente após 2º chamado

    EM_ATENDIMENTO --> ATENDIDA : Atendente finaliza o serviço
    NAO_COMPARECEU --> [*]
    ATENDIDA --> [*]