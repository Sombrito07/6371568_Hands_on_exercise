import React from 'react';
import CalculateScore from './Components/CalculateScore';
import './Stylesheets/mystyle.css';

function App() {
  return (
    <div className="container">
      <CalculateScore Name="Steeve" School="DNV Public School" Total={284} />
    </div>
  );
}

export default App;