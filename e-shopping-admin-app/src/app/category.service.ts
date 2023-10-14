import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import { Category } from './category';
@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  baseUrl:string ="http://localhost:3000/categories";
  constructor(public http:HttpClient) { }

  // get method only url 
  loadAllCategoryDetails() :Observable<Category[]>{
    return this.http.get<Category[]>(this.baseUrl);
  }

  // url and data in json format to backend technologies or json-server. 
  storeCategory(category:any):Observable<any>{
    return this.http.post(this.baseUrl,category);
  }

  // url/id need to pass to json server to delete the records. 
  deleteCategory(id:any):Observable<any> {
    return this.http.delete(this.baseUrl+"/"+id);
  }

  // update category set categoryName = value where id = 1;
  updateCategory(category:any):Observable<any> {
    return this.http.put(this.baseUrl+"/"+category.id,category);
  }
}





