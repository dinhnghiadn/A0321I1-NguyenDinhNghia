import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HackerNewsComponent } from './hacker-news/hacker-news.component';
import {FormsModule} from '@angular/forms';
import { LikesComponent } from './likes/likes.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { ArticleDetailComponent } from './article-detail/article-detail.component';
import { ArticleCreateComponent } from './article-create/article-create.component';

@NgModule({
  declarations: [
    AppComponent,
    HackerNewsComponent,
    LikesComponent,
    NavbarComponent,
    FooterComponent,

    ArticleDetailComponent,

    ArticleCreateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
