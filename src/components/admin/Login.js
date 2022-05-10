import React from 'react'
import axios from 'axios';
class Login extends React.Component{
    eventWorker(){
        let postData={
            name:"Yadav ",
            email:"yadavforu@gmail.com",
            salary:123,
            quali:'B.tech',
            phone:123456789,
            password:9999,
            subject:[]
        }
        axios.post('http://localhost:3001/tec/addTeacher'
        , postData)
        .then(({data})=> console.log(data));
    }
    render(){
        return (
            <>
                <h1>User login page</h1>
                <button onClick={this.eventWorker}>Click Me</button>
            </>
        );
    }
}
export default Login;