import React from 'react';
import Totem from './components/Totem';

function App() {
  return (
    <div>
      <header style={{ background: '#003366', color: '#fff', padding: '20px', textAlign: 'center' }}>
        <h1>Laboratório de Análises Clínicas - nassauTickets</h1>
      </header>
      <main>
        <Totem />
      </main>
    </div>
  );
}

export default App;
