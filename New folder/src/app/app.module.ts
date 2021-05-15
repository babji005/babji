import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { PostsComponent } from './posts/posts.component';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';

export const routes: Routes =
  [
    {
      path: '',
      component: HomeComponent
    },
    {
      path: 'signin',
      component: SignInComponent
    },
    {
      path: 'signup',
      component: SignUpComponent
    },
    {
      path: 'posts',
      component: PostsComponent
    }
  ]

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    SignInComponent,
    SignUpComponent,
    PostsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }