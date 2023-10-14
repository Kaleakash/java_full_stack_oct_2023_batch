import { Component } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

loginRef = new FormGroup({
  emailid:new FormControl(),
  password:new FormControl()
});
msg:string ="";
constructor(public loginService:LoginService,public router:Router){}   // DI for loginService class. 
signIn(): void {

  let login = this.loginRef.value;
  //console.log(login);
  let result = this.loginService.checkLoginDetails(login);
  if(result){
      alert("successfully login");
      this.router.navigate(["home"]);
  } else {
      this.msg="Invalid emailid or password";
  } 
  this.loginRef.reset();

}
}
