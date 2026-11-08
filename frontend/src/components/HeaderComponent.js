import React, {Component} from 'react'

class HeaderComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {}
    }

    render() {
        return (
            <div>
                <header>
                    <nav className="navbar navbar-expand-md navbar-dark bg-dark">
                        <div className="container-fluid">
                            <a href="https://s.id/hendisantika" className="navbar-brand">Employee Management App</a>
                            <a href="/" className="navbar-brand">Home Page</a>
                        </div>
                    </nav>
                </header>
            </div>
        )
    }
}

export default HeaderComponent
