import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router,Routes,Route} from 'react-router-dom'
import Dashboard from './components/admin/Dashboard';
import About from './components/admin/About';
import Login from './components/admin/Login';
import Profile from './components/admin/Profile';
import Allfriends from './components/admin/Allfriends';
function App() {
  return (
    <>
      <Router>
        <Routes>
          <Route path="/" element={<Login />} />
          <Route path="/user" element={<Dashboard/>}>
            <Route path="profile" element={<Profile />} />
            <Route path="allfriends" element={<Allfriends />} />
          </Route>
          <Route path="/about" element={<About />} />
        </Routes>
      </Router>
    </>
  );
}

export default App;
