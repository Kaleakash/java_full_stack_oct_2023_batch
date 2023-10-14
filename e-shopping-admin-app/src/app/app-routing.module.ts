import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { CategoryComponent } from './category/category.component';

const routes: Routes = [
  {path:"",component:LoginComponent},
  {path:"home",component:DashboardComponent,children:[
    
    {path:"category",component:CategoryComponent},

  ]},
  {path:"login",component:LoginComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
