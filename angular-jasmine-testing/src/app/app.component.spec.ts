import { TestBed } from '@angular/core/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => {

  beforeEach(() => TestBed.configureTestingModule({
    declarations: [AppComponent]          // load the component. 
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);  // id of component 
    const app = fixture.componentInstance;            // created reference of app component without using new keyword. 
    expect(app).toBeTruthy();       // object create or not. 
  });

  it(`should have as title 'angular-jasmine-testing'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('angular-jasmine-testing');   // checking title variable value. 
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();        // load the DOM Elements or template page 
    const compiled = fixture.nativeElement as HTMLElement;    // compiled is dom element reference. 
    expect(compiled.querySelector('.content span')?.textContent).toContain('angular-jasmine-testing app is running!');
  });


});
