import React from 'react';

const IndianPlayers = () => {
  const players = [
    "Sachin1",
    "Dhoni2",
    "Virat3",
    "Rohit4",
    "Yuvaraj5",
    "Raina6"
  ];

  const getLabel = (index) => {
    const labels = ["First", "Second", "Third", "Fourth", "Fifth", "Sixth"];
    return labels[index] || `#${index + 1}`;
  };

  const oddPlayers = players.filter((_, i) => i % 2 === 0);  // 0,2,4
  const evenPlayers = players.filter((_, i) => i % 2 !== 0); // 1,3,5

  const mergedPlayers = [
    "Mr. First Player",
    "Mr. Second Player",
    "Mr. Third Player",
    "Mr. Fourth Player",
    "Mr. Fifth Player",
    "Mr. Sixth Player",
  ];

  return (
    <div style={{ width: "60%", margin: "0 auto", fontFamily: "Arial" }}>
      <h2>Odd Players</h2>
      <ul>
        {oddPlayers.map((name, index) => (
          <li key={index}>
            {getLabel(index * 2)} : {name}
          </li>
        ))}
      </ul>

      <hr />

      <h2>Even Players</h2>
      <ul>
        {evenPlayers.map((name, index) => (
          <li key={index}>
            {getLabel(index * 2 + 1)} : {name}
          </li>
        ))}
      </ul>

      <hr />

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
