import React, { Component } from 'react';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 5,
      amount: '',
      currency: '',
      converted: null
    };

    this.handleWelcome = this.handleWelcome.bind(this);
    this.handleClick = this.handleClick.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 }, () => {
      this.sayHello();
    });
  };

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  sayHello = () => {
    alert('Hello! Member1');
  };

  handleWelcome(message) {
    alert(message);
  }

  handleClick(event) {
    alert('I was clicked');
  }

  handleChange = (e) => {
    this.setState({ [e.target.name]: e.target.value });
  };

  handleSubmit(e) {
    e.preventDefault();
    const { amount } = this.state;
    const euroRate = 0.011; // 1 INR = 0.011 EUR
    const converted = amount * euroRate;
    this.setState({ converted });
  }

  render() {
    return (
      <div className="App">
        <p>{this.state.count}</p>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
        <br />
        <button onClick={() => this.handleWelcome('welcome')}>Say welcome</button>
        <br />
        <button onClick={this.handleClick}>Click on me</button>

        <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>

        <form onSubmit={this.handleSubmit}>
          <label>
            Amount:
            <input
              type="number"
              name="amount"
              value={this.state.amount}
              onChange={this.handleChange}
              required
            />
          </label>
          <br />
          <label>
            Currency:
            <textarea
              name="currency"
              value={this.state.currency}
              onChange={this.handleChange}
            />
          </label>
          <br />
          <button type="submit">Submit</button>
        </form>

        {this.state.converted && (
          <p>
            Converted to Euro: <strong>{this.state.converted.toFixed(2)} EUR</strong>
          </p>
        )}
      </div>
    );
  }
}

export default App;
