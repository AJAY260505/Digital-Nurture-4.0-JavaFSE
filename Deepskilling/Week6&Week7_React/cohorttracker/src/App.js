import React from "react";
import CohortDetails from "./CohortDetails";

function App() {
  const cohorts = [
    {
      id: "INTADMDFIO",
      tech: "- .NET FSD",
      startedOn: "22.Feb-2022",
      status: "Scheduled",
      coach: "AJAY",
      trainer: "Jojo Jose"
    },
    {
      id: "ADM21JF014",
      tech: "Java FSD",
      startedOn: "10-Sep.2021",
      status: "Ongoing",
      trainer: "Elisa Smith"
    },
    {
      id: "CDBJF21025",
      tech: "Java FSD",
      startedOn: "24.Dec-2021",
      status: "Ongoing",
      coach: "AJAY",
      trainer: "John Doe"
    }
  ];

  return (
    <div style={{ padding: "20px" }}>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
