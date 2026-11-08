import {render, screen} from '@testing-library/react';
import App from './App';

// Avoid real HTTP calls to the backend during tests.
// Plain functions (not jest.fn) because CRA enables `resetMocks`.
jest.mock('./services/EmployeeService', () => ({
    __esModule: true,
    default: {
        getEmployees: () => Promise.resolve({data: []}),
    },
}));

test('renders employee management header and list', async () => {
    render(<App/>);
    expect(screen.getByText(/Employee Management App/i)).toBeInTheDocument();
    expect(await screen.findByText(/Employees List/i)).toBeInTheDocument();
});
