import React from 'react'
import { Link } from 'react-router-dom';
class Header extends React.Component{
    render(){
        return (
            <>
                <ul>
                    <li>
                        <Link to="/">Home</Link>
                    </li>
                    <li>
                        <Link to="/about">About</Link>
                    </li>
                    <li>
                        <Link to="/user">Dashboard</Link>
                    </li>
                    <li>
                        <Link to="/user/profile">Profile</Link>
                    </li>
                    <li>
                        <Link to="/user/allfriends">Allfriends</Link>
                    </li>
                </ul>
            </>
        );
    }
}
export default Header;