import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { MyGender } from './gender.pipe';
import { EmployeeFilterPipe } from './employee-filter.pipe';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    MyGender,
    EmployeeFilterPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
