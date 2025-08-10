import React from "react";
import "../Stylesheets/mystyle.css";

function CalculateScore() {
  const name = "Ajay";
  const school = "G.K.SHETTY VIVEKANADA VIDYALAYA";
  const total = 455;
  const goal = 500;

  const average = (total / goal) * 100;

  return (
    <div className="score-card">
      <h2>Student Score Calculator</h2>
      <p><strong>Name:</strong> {name}</p>
      <p><strong>School:</strong> {school}</p>
      <p><strong>Total Marks:</strong> {total}</p>
      <p><strong>Goal Marks:</strong> {goal}</p>
      <p><strong>Average Score:</strong> {average.toFixed(2)}%</p>
    </div>
  );
}

export default CalculateScore;
