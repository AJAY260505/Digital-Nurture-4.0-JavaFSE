import React, { Component } from 'react';

class Getuser extends Component {
  constructor(props) {
    super(props);
    this.state = {
      user: null,
      loading: true
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch('https://api.randomuser.me/');
      const data = await response.json();
      this.setState({
        user: data.results[0],
        loading: false
      });
    } catch (error) {
      console.error("Error fetching user data:", error);
    }
  }

  render() {
    const { user, loading } = this.state;

    if (loading) {
      return <h3>Loading user data...</h3>;
    }

    return (
      <div style={{ textAlign: 'center', marginTop: '30px' }}>
        <h2>User Details</h2>
        <img src={user.picture.large} alt="User" />
        <p>
          <strong>Title:</strong> {user.name.title}
        </p>
        <p>
          <strong>First Name:</strong> {user.name.first}
        </p>
      </div>
    );
  }
}

export default Getuser;
