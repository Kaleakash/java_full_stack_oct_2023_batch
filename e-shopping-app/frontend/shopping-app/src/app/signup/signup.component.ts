import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit{
 
  loginRef = new FormGroup({
    emailid:new FormControl(),
    password:new FormControl(),
    typeofuser:new FormControl()
   });
  
    constructor(public ls:LoginService,public router:Router) {}  // di for login service 
  
    ngOnInit(): void {
        
    }
    msg:string ="";
    signUp():void {
      let login  = this.loginRef.value;
  
      console.log(login);
      this.ls.signUp(login).subscribe({
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