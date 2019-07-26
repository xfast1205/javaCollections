import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, TimeInterval, interval, of, from } from 'rxjs';
import { mergeMap } from 'rxjs/operators';
// import { jsforce } from 'jsforce';
// import { loginToSfdc } from 'src/loginToSfdc';
// import {jslog} from '../app/jslog.js';

// let defaultClient = new Rest(); // uses default conn

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent {
    private baseUrl = 'https://api.status.salesforce.com/v1/';
    private sfdcProduct = 'Service_Cloud' + '/';
    public products = [];
    private pollInterval = 2 * 60 * 10;

    constructor(private httpClient: HttpClient) {
        // this.httpClient.get(this.baseUrl + 'products' + '/' + this.sfdcProduct).subscribe((res: any[]) => {
        //     this.products = res['Instances'].slice(0, 10);
        // });
    }

    pollStatus() {
        interval(this.pollInterval)
        .pipe(
            mergeMap(
                () => this.httpClient.get(this.baseUrl + 'products' + '/' + this.sfdcProduct)
            )
        )
        .subscribe(data => {
            console.log(data);
            this.products = data['Instances'].slice(0, 10);
        });
    }

    refreshPoll() {
        window.location.reload();
    }
}
