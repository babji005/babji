import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Post } from 'src/app/model/post';


@Injectable({
  providedIn: 'root'
})
export class PostsService {
  posts!: Post[];
  constructor(public http:HttpClient) {
   
   }
   getPosts() {
    this.http.get<Post[]>('http://localhost:8080/posts/view').subscribe(res => {
      this.posts = res
    })
  }

  addPost(newPost: Post){
    return this.http.post<Post>('http://localhost:8080/posts/add',newPost)
  }

  deletePost(postId:number){
    return this.http.delete<boolean>('http://localhost:8080/posts/delete/' + postId)
  }
}