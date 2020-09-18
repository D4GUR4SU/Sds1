import React from 'react';
import './App.css';
import Header from './components/Header';
import Home from './pages/Home';
import Pagination from './pages/Pagination';
import Records from './pages/Records';

function App() {
  return (
    <div>
      <Header />
      <Home />
      <Pagination />
      <Records />
    </div>
  );
}

export default App;
