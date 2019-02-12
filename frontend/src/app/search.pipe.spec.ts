import {SearchPipe} from './search.pipe';

describe('SearchPipe', () => {
  const john = {firstName: "John", lastName: "Mannheimer"};
  const markus = {firstName: "Markus", lastName: "Doe"};
  const employees = [
    john,
    markus,
  ];

  it('create an instance', () => {
    const pipe = new SearchPipe();
    expect(pipe).toBeTruthy();
  });

  it('search on first and lastName with empty string', () => {
    const pipe = new SearchPipe();

    let filteredEmployees = pipe.transform(employees, 'firstName,lastName', '');
    expect(filteredEmployees).toEqual(employees);
  });

  it('search on first and lastName with matching first and matching lastname', () => {
    const pipe = new SearchPipe();
    let filteredEmployees = pipe.transform(employees, 'firstName,lastName', 'MA');
    expect(filteredEmployees).toEqual(employees);
  });

  it('search on firstName with matching firstname', () => {
    const pipe = new SearchPipe();
    let filteredEmployees = pipe.transform(employees, 'firstName', 'Ma');
    expect(filteredEmployees).toEqual([markus]);
  });

  it('search on lastName with matching lastName', () => {
    const pipe = new SearchPipe();
    let filteredEmployees = pipe.transform(employees, 'lastName', 'ma');
    expect(filteredEmployees).toEqual([john]);
  });

  it('search on first/lastName with not-matching term', () => {
    const pipe = new SearchPipe();
    let filteredEmployees = pipe.transform(employees, 'firstName,lastName', 'xx');
    expect(filteredEmployees).toEqual([]);
  });

  it('search on anything with not-matching term', () => {
    const pipe = new SearchPipe();
    let filteredEmployees = pipe.transform(employees, '*', 'a');
    expect(filteredEmployees).toEqual(employees);
  });

  it('search on not existing key sould return empty', () => {
    const pipe = new SearchPipe();
    let filteredEmployees = pipe.transform(employees, 'notExisting', 'a');
    expect(filteredEmployees).toEqual([]);
  });
});
