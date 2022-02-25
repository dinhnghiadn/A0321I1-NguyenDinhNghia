import { Component, OnInit } from '@angular/core';
import { Article } from './article';
import { articleList } from './articleList';

@Component({
  selector: 'app-hacker-news',
  templateUrl: './hacker-news.component.html',
  styleUrls: ['./hacker-news.component.css']
})
export class HackerNewsComponent  {

  article = {
    title: 'The Evolution of Async JavaScript: From Callbacks, to Promises, to Async/Await',
    url: 'https://medium.freecodecamp.org/the-evolution-of-async-javascript-from-callbacks-to-promises-to-async-await-e73b047f2f40'
  };
  articles = articleList ;
  // updateArticle() {
  //   this.article.title = document.getElementById('article-title').value;
  //   this.article.url = document.getElementById('article-url').value;
  // }
  // articleForm: Article = {
  //   title: '',
  //   url: ''
  // } ;


  handleViewClick(art: Article) {
    this.article = art ;
    this.article.title = (document.getElementById('art-title') as HTMLInputElement).value;
    this.article.url = (document.getElementById('art-url') as HTMLInputElement).value;
  }
}
