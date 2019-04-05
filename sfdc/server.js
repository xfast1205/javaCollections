//Install express server
const express = require('express');
const path = require('path');
const jsforce = require('jsforce');
const username = 'andrey.ryzhkov@ringcentral.com.box16';
const password = 'Lifeisgame{}1';
const securityToken = 'aE6iC5Yf1qmzPrYpyDtKXrmN';
const conn = new jsforce.Connection({
    loginUrl: "https://rc--box16.cs63.my.salesforce.com"
});

const app = express();

app.use(express.static(__dirname + '/dist/heroku-sfdc-status'));

app.get('/*', function(req,res) {
    
res.sendFile(path.join(__dirname+'/dist/heroku-sfdc-status/index.html'));
});


// Start the app by listening on the default Heroku port
app.listen(process.env.PORT || 8080);
