import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse} from "@angular/common/http";
import { IMovies } from "./movies";
import { Observable} from "rxjs/internal/Observable";
import { throwError } from 'rxjs/internal/observable/throwError';
import { catchError } from 'rxjs/operators';
@Injectable({ 
  providedIn: 'root' 
})
export class MovieDetailsService {
   private _url: string = "/assets/data/movies.json"
   constructor(private http:HttpClient) { }
   getMovies(): Observable<IMovies[]>
   {   
     return this.http.get<IMovies[]>(this._url);
   }
   errorHandler(error: HttpErrorResponse){
    return Observable.throw(error.message || "Server Error");
   }
   getMoviesList():any{
    let reponse = this.http.get("http://localhost:8080/movies/all");
    reponse.subscribe((data)=>console.log(data));
   }
  
  }