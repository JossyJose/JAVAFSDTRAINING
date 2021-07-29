
import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Home from './Home';
import About from './About';
import {BrowserRouter as Router,Route,NavLink} from "react-router-dom";

  function App() {
    return (
    <Router>
      <div className="App">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <NavLink exact to="/Home" className="my-link">Home</NavLink>
      <NavLink exact to="/About" className="my-link">About</NavLink>

    </div>
  </div>
</nav>

      </div>
      <Route exact path="/home">
        <Home/>
      </Route>
      <Route exact path="/about">
        <About/>
      </Route>
      </Router>
    );
  }
  
 /* ReactDOM.render(
    <App />,
    document.getElementById('root')
  );*/

//ReactDOM.render(<h1>Hello World Hi</h1>, document.getElementById('root'));


       


export default App;
