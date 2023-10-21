import { Pipe, PipeTransform } from "@angular/core";


@Pipe({
    name:"GenderPipe"
})
export class MyGender implements PipeTransform{
    transform(value: any, gender:any) {
        console.log("I Came Here "+value);
        console.log("Gender of user is "+gender);
        if(gender=="male"){
            return "Mr. "+value;
        }else {
            return "Miss. "+value;
        }
        //return "Welcome user "+value;
    }
}