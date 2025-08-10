import React, { Component } from 'react';
import './CountPeople.css';

class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0,
    };
  }

  updateEntry = () => {
    this.setState((prevState) => ({
      entryCount: prevState.entryCount + 1
    }));
  };

  updateExit = () => {
    this.setState((prevState) => ({
      exitCount: prevState.exitCount + 1
    }));
  };

  render() {
    return (
      <div className="container">
        <h1>Mall Entry Counter</h1>
        <p className="count">People Entered: {this.state.entryCount}</p>
        <p className="count">People Exited: {this.state.exitCount}</p>
        <button className="btn" onClick={this.updateEntry}>Login</button>
        <button className="btn" onClick={this.updateExit}>Exit</button>
      </div>
    );
  }
}

export default CountPeople;
