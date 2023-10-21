import { EmployeeFilterPipe } from './employee-filter.pipe';

describe('EmployeeFilterPipe', () => {
  it('create an instance', () => {
    const pipe = new EmployeeFilterPipe();
    expect(pipe).toBeTruthy();
  });
});
