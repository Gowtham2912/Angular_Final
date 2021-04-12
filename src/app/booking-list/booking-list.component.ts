import { MovieDetailsService } from './../movie-details.service';
import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'booking-list',
  template: `
    <h2>Movies List with Rating</h2>
    <h3>{{errorMsg}}</h3>    
    <ul *ngFor="let movie of movies">
      <li>{{movie.id}}. {{movie.name}} - {{movie.rating}}</li>
    </ul>
  `,
  styles: []
})
export class BookingListComponent implements OnInit {

  public movies : any;
  public errorMsg: any;
  
  constructor(private http:HttpClient) { }

  ngOnInit() {
    let reponse = this.http.get("http://localhost:8080/movies/all");
    reponse.subscribe((data)=>this.movies=(data));
        
  }

}