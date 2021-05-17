import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from 'src/app/model/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  user!: User;
  signInStatus!: boolean;

  constructor(public http: HttpClient) { 

  }

  signUp(newUser: User) {
    return this.http.post<User>('http://localhost:8080/signup', newUser)
  }

  signIn(existingUser: User) {
    return this.http.post<User>('http://localhost:8080/signin', existingUser)
  }
}
