import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  baseUrl:string ="http://localhost:8181/login";

  constructor(public httpClient:HttpClient) { } // DI for HttpClient 

  // post method takes two parameter 1st parameter url and 2nd json object, 3rd response type 
  signIn(login:any):Observable<string>{
    return this.httpClient.post(this.baseUrl+"/signIn",login,{responseType:'text'});
  }

  signUp(login:any):Observable<string>{
    return this.httpClient.post(this.baseUrl+"/signUp",login,{responseType:'text'});
  }

}
