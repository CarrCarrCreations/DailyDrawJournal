import React, { Component } from 'react';
import './App.css';
import axios from 'axios';

class App extends Component {
  state = {
    greeting: []
  };

  async componentDidMount() {
    await axios.get('/api/greetings').then(result => {
      this.setState({
        greeting: result.data
      });
    });
  }

  render() {
    return (
      <div className="App">
        <h1>Greetings</h1>
        {this.state.greeting.map(greeting => {
          return <p>{greeting.message}</p>;
        })}
      </div>
    );
  }
}

export default App;
