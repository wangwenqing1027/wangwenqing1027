import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import {Button} from "antd";

class App extends Component {
  render() {
    return (
      <div className="App">
          <Button type="primary">Primary</Button>
          <Button>Default</Button>
          <Button type="dashed">Dashed</Button>
          <Button type="danger">Danger</Button>
          <Button type="link">Link</Button>
      </div>
    );
  }
}

export default App;
