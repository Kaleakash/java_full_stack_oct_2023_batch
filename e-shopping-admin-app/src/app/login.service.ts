import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }


  checkLoginDetails(login:any):boolean {
    // we can pass this information to java technology 
    // created using rest api java check this information from database. 
    
    if(login.emailid=="admin@gmail.com" && login.password=="admin@123"){
      return true;
    }else {
      return false;
    }

  }
}
