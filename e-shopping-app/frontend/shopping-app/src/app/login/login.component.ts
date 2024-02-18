import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{
 
loginRef = new FormGroup({
  emailid:new FormControl(),
  password:new FormControl(),
  typeofuser:new FormControl()
 });

  constructor(public ls:LoginService,public router:Router) {}  // di for login service 

  ngOnInit(): void {
      
  }
  msg:string ="";
  signIn():void {
    let login  = this.loginRef.value;

    console.log(login);
    this.ls.signIn(login).subscribe({
      next:(result:any)=> {
        if(result=="Admin login successfully"){
          this.msg = result;
           this.router.navigate(["adminhome"]); 
        }else if(result=="Customer login successfully"){
          this.msg = result;
          this.router.navigate(["customerhome"]); 
        }else {
            this.msg = result;
        }
      },
      error:(error:any)=>console.log(error),
      complete:()=>console.log("signup done!")
    });

    this.loginRef.reset();
  }
}







