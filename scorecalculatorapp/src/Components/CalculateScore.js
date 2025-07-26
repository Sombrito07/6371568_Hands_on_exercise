import React from 'react';

const CalculateScore = ({ Name, School, Total }) => {
  // Calculate percentage assuming total marks are 300
  const percentage = ((Total / 300) * 100).toFixed(2);

  return (
    <div>
      <h1 style={{ color: 'red' }}>Student Details:</h1>
      <p><span style={{ color: 'blue' }}>Name:</span> {Name}</p>
      <p><span style={{ color: 'red' }}>School:</span> {School}</p>
      <p>Total: {Total} Marks</p>
      <p><span style={{ color: 'green' }}>Score:</span> {percentage}%</p>
    </div>
  );
};

export default CalculateScore;