import React, {Component} from 'react'
import withRouter from '../withRouter';
import EmployeeService from '../services/EmployeeService'

class ViewEmployeeComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.params.id,
            employee: {}
        }
    }

    componentDidMount() {
        EmployeeService.getEmployeeById(this.state.id).then(res => {
            this.setState({employee: res.data});
        })
    }

    render() {
        return (
            <div>
                <br></br>
                <div className="card col-md-6 offset-md-3">
                    <h3 className="text-center"> View Employee Details</h3>
                    <div className="card-body">
                        <div className="row">
                            <label className="col-auto fw-bold"> Employee First Name: </label>
                            <div className="col"> {this.state.employee.firstName}</div>
                        </div>
                        <div className="row">
                            <label className="col-auto fw-bold"> Employee Last Name: </label>
                            <div className="col"> {this.state.employee.lastName}</div>
                        </div>
                        <div className="row">
                            <label className="col-auto fw-bold"> Employee Email: </label>
                            <div className="col"> {this.state.employee.email}</div>
                        </div>
                    </div>

                </div>
            </div>
        )
    }
}

export default withRouter(ViewEmployeeComponent)
