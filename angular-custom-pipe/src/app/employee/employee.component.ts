import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit{
employees:Array<Employee>=[];
constructor(){}
ngOnInit(): void {
    this.employees.push(new Employee(1,"Ravi",24000,"male"));
    this.employees.push(new Employee(2,"Reeta",26000,"female"));
    this.employees.push(new Employee(3,"Ajay",28000,"male"));
    this.employees.push(new Employee(4,"Meeta",29000,"female"));
}
}
