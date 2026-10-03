CREATE DATABASE IF NOT EXISTS nassau_tickets;
USE nassau_tickets;

CREATE TABLE IF NOT EXISTS senhas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero VARCHAR(20) NOT NULL UNIQUE,          -- Ex: 261014-SP001
    tipo VARCHAR(2) NOT NULL,                    -- 'SP', 'SG', 'SE'
    estado VARCHAR(30) NOT NULL DEFAULT 'EMITIDA',-- EMITIDA, AGUARDANDO, CHAMADA, etc.
    guiche INT NULL,                             -- Guichê responsável
    atendente VARCHAR(100) NULL,                 -- Nome do atendente
    data_emissao DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    data_atendimento DATETIME NULL,
    data_finalizacao DATETIME NULL,
    chamada_contador INT DEFAULT 0               -- Controle de abandono
);
