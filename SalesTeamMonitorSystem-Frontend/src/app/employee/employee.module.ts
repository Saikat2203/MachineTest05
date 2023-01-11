import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmployeeComponent } from './employee.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { ListEmployeeComponent } from './list-employee/list-employee.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { NgxPaginationModule } from 'ngx-pagination';
import { Routes } from '@angular/router';
import { EmployeeService } from '../shared/service/employee.service';

const employeeRoutes: Routes = [
  {
    path: 'employee',
    component: EmployeeComponent,
    children: [
      {
        path: 'addEmployee',
        component: AddEmployeeComponent,
      },
      {
        path: 'listEmployees',
        component: ListEmployeeComponent,
      },
    ],
  },
];

@NgModule({
  declarations: [
    EmployeeComponent,
    AddEmployeeComponent,
    ListEmployeeComponent,
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    Ng2SearchPipeModule,
    NgxPaginationModule,
  ],
  providers: [EmployeeService],
})
export class EmployeeModule {}
