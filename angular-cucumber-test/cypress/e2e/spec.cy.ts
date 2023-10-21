import {Given} from 'cypress-cucumber-preprocessor/steps';
describe('My First Test', () => {
  it('Visits the initial project page', () => {
    cy.visit('/')   // base URL : http://localhost:4200 
    //cy.contains('app is running!')
    cy.contains("E2E testing")
    let ref1 = cy.get("#abc");
    ref1.should("have.text","Today we are learning angular testing");
    cy.wait(4000);
    let cname = cy.get("#cname");
    cname.type("Akash");
    cy.wait(4000);
    let cemail = cy.get("#cemail");
    cemail.type("akash@gmail.com");
    cy.wait(4000);
    let button = cy.get("#b1");
    button.click();
  })
})


// Given("Visit the Page",()=> {
//   cy.visit("/");
// })