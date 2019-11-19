import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import './index.css';
import WrappedNormalLoginForm from "./Login";
import {Test} from "./Test";

ReactDOM.render(
  <WrappedNormalLoginForm />,
  document.getElementById('root')
);
