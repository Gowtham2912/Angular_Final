import { MovieDetailsService } from './../movie-details.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'booking',
  template: `
    <h2>Movie Detail</h2>
    <h3>{{errorMsg}}</h3>    
    <ul *ngFor="let movie of movies">
      <li>{{movie.id}}. {{movie.name}} - {{movie.genre}}</li>
    </ul>
  `,
  styles: []
})
export class BookingComponent implements OnInit {

  public movies : any[] | undefined;
  public errorMsg: any;
  
  constructor(private _movieService:MovieDetailsService) { }

  ngOnInit() {
    this._movieService.getMovies()
      .subscribe(data => this.movies = data,
                 error => this.errorMsg = error);
        
  }

}