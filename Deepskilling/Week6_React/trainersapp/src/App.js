import React from "react";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Home from "./components/Home";
import TrainersList from "./components/TrainerList";
import TrainerDetail from "./components/TrainerDetail";
import trainers from "./components/TrainersMock";


function App() {
  return (
    <Router>
      <nav>
        <Link to="/">Home</Link> |{" "}
        <Link to="/trainers">Trainers</Link>
      </nav>
      <hr />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/trainers" element={<TrainersList trainers={trainers} />} />
        <Route path="/trainers/:id" element={<TrainerDetail />} />
      </Routes>
    </Router>
  );
}

export default App;
