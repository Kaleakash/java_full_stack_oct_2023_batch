describe('My First Test', () => {
  it('Visits the initial project page', () => {
    cy.visit('/')   // base URL : http://localhost:4200 
    //cy.contains('app is running!')
    cy.contains("E2E testing")
    let ref1 = cy.get("#abc");
    ref1.should("have.text","Today we are learning angular testing");
    //ref1.should("")
  })
})
