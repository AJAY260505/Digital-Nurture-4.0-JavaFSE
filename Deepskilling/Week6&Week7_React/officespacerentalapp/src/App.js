import React from "react";

// Sample office data
const officeSpaces = [
  {
    name: "DBS",
    rent: 50000,
    address: "Chennai",
    image: "office.jpg",
  },
  {
    name: "Tidel Park",
    rent: 75000,
    address: "Chennai",
    image: "office.jpg",
  },
];

function App() {
  return (
    <div style={{ textAlign: "center", fontFamily: "Arial, sans-serif" }}>
      <h1 style={{ fontWeight: "bold", marginBottom: "30px" }}>
        Office Space at Affordable Range
      </h1>

      {officeSpaces.map((office, index) => (
        <div key={index} style={{ marginBottom: "50px" }}>
          <img
            src={office.image}
            alt="Office"
            style={{ width: "300px", height: "auto", borderRadius: "10px" }}
          />

          <h2 style={{ marginTop: "20px" }}>Name: {office.name}</h2>
          <p
            style={{
              color: office.rent < 60000 ? "red" : "green",
              fontWeight: "bold",
              fontSize: "18px",
            }}
          >
            Rent: Rs. {office.rent}
          </p>
          <p style={{ fontWeight: "bold" }}>Address: {office.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
