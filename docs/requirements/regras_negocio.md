# Regras de Negócio - nassauTickets

## RN01 - Classificação e Tipos de Senha
- **SP (Senha Prioritária):** Gestantes, idosos, PCD e autistas.
- **SE (Senha de Exames):** Retirada de resultados ou entregas rápidas.
- **SG (Senha Geral):** Atendimento convencional.

## RN02 - Priorização no Atendimento
O sistema alterna a chamada das filas respeitando a ordem:
`SP -> SE -> SP -> SG` (Se a fila `SP` estiver vazia, chama-se o próximo de `SE` ou `SG`).

## RN03 - Padronização dos Códigos das Senhas
- **Formato:** `YYMMDD-PPSQ` (Exemplo: `261001-SP001`)
  - `YYMMDD`: Data atual (ex: 01/10/2026).
  - `PP`: Sigla do tipo (`SP`, `SE`, `SG`).
  - `SQ`: Sequencial diário com 3 dígitos (`001`, `002`), zerado diariamente às 00:00.

## RN04 - Horário de Funcionamento e Descarte
- O sistema emite senhas entre **07h00 e 17h00**.
- Senhas não atendidas até o encerramento do expediente são marcadas como `NÃO_ATENDIDA`.

## RN05 - Descarte por Ausência (Abandono)
- Uma senha pode ser chamada no máximo **2 vezes**.
- Se após o 2º chamado o cliente não comparecer, a senha é marcada como `NÃO_COMPARECEU`.