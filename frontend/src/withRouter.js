import React from 'react';
import {useNavigate, useParams} from 'react-router-dom';

// react-router v6+ removed withRouter and the history/match props.
// This HOC injects `navigate` and `params` into class components.
function withRouter(Component) {
    function ComponentWithRouterProps(props) {
        const navigate = useNavigate();
        const params = useParams();
        return <Component {...props} navigate={navigate} params={params}/>;
    }

    return ComponentWithRouterProps;
}

export default withRouter;
