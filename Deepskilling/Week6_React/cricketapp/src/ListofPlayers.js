import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: "Virat Kohli", score: 95 },
    { name: "Rohit Sharma", score: 88 },
    { name: "Shubman Gill", score: 67 },
    { name: "KL Rahul", score: 58 },
    { name: "Rishabh Pant", score: 76 },
    { name: "Hardik Pandya", score: 45 },
    { name: "Jadeja", score: 70 },
    { name: "Ashwin", score: 35 },
    { name: "Shami", score: 60 },
    { name: "Bumrah", score: 55 },
    { name: "Siraj", score: 80 },
  ];

  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div style={{ textAlign: 'center' }}>
      <h2>All Players (Using map)</h2>
      {players.map((player, index) => (
        <p key={index}>{player.name} - {player.score}</p>
      ))}

      <h2>Players with score less than 70 (Using Arrow Function)</h2>
      {filteredPlayers.map((player, index) => (
        <p key={index}>{player.name} - {player.score}</p>
      ))}
    </div>
  );
};

export default ListofPlayers;
