const API_URL = 'http://localhost:8080/api';

export async function emitirSenha(tipo) {
  try {
    const response = await fetch(`${API_URL}/tickets/emitir`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ tipo }),
    });

    if (!response.ok) {
      throw new Error('Erro ao emitir senha');
    }

    return await response.json();
  } catch (error) {
    console.error('Erro na comunicação com o backend:', error);
    throw error;
  }
}
