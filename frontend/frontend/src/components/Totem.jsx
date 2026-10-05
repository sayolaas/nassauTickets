import React, { useState } from 'react';
import { emitirSenha } from '../services/api';

export default function Totem() {
  const [senhaGerada, setSenhaGerada] = useState(null);
  const [loading, setLoading] = useState(false);
  const [erro, setErro] = useState('');

 const handleEmitir = async (tipo) => {
    setLoading(true);
    setErro('');
    try {
      const resultado = await emitirSenha(tipo);
      setSenhaGerada(resultado); // <-- Alterado de resultado.senha para apenas resultado
    } catch (err) {
      setErro('Não foi possível conectar ao servidor. Verifique se o backend está rodando.');
    } finally {
      setLoading(false);
    }
  };

  return (
    <div style={{ padding: '40px', textAlign: 'center', maxWidth: '600px', margin: '40px auto', background: '#fff', borderRadius: '8px', boxShadow: '0 4px 12px rgba(0,0,0,0.1)' }}>
      <h2>nassauTickets - Totem de Atendimento</h2>
      <p>Selecione o tipo de atendimento desejado:</p>

      <div style={{ display: 'flex', flexDirection: 'column', gap: '15px', margin: '30px 0' }}>
        <button 
          onClick={() => handleEmitir('SP')} 
          disabled={loading}
          style={{ padding: '15px', fontSize: '18px', background: '#d9534f', color: '#fff', border: 'none', borderRadius: '5px', cursor: 'pointer' }}
        >
          Senha Prioritária (SP)
        </button>
        <button 
          onClick={() => handleEmitir('SG')} 
          disabled={loading}
          style={{ padding: '15px', fontSize: '18px', background: '#0275d8', color: '#fff', border: 'none', borderRadius: '5px', cursor: 'pointer' }}
        >
          Senha Geral (SG)
        </button>
        <button 
          onClick={() => handleEmitir('SE')} 
          disabled={loading}
          style={{ padding: '15px', fontSize: '18px', background: '#f0ad4e', color: '#fff', border: 'none', borderRadius: '5px', cursor: 'pointer' }}
        >
          Retirada de Exames (SE)
        </button>
      </div>

      {erro && <p style={{ color: 'red' }}>{erro}</p>}

      {senhaGerada && (
        <div style={{ marginTop: '20px', padding: '20px', background: '#e9ecef', borderRadius: '5px' }}>
          <h3>Senha Emitida com Sucesso!</h3>
          <h1 style={{ fontSize: '48px', color: '#333', margin: '10px 0' }}>{senhaGerada.numero}</h1>
          <p>Tipo: <strong>{senhaGerada.tipo}</strong></p>
          <p>Guarde sua senha e aguarde a chamada no painel.</p>
        </div>
      )}
    </div>
  );
}
