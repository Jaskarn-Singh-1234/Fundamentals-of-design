import React from 'react'
import { Outlet } from 'react-router-dom';
import Footer from '../layouts/Footer';
import Header from '../layouts/Header';
class Dashboard extends React.Component{
    render(){
        return (
            <>
                <Header/>
                    <h2>Welcome to APP JS</h2>
                    <Outlet/>
                <Footer/>
            </>
        );
    }
}
export default Dashboard;