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

function handleError(res, reason, message, code) {
    console.log("ERROR: " + reason);
    res.status(code || 500).json({"error": message});
}

app.get("/", function(req, res) {
    return res.send('Received a GET HTTP method');
    // conn.login(username, password + securityToken, function(err, res) {
    //     if (err) {
    //         return console.error(err);
    //     }
    //     console.log('Authenticated');
    //     var records = [];
    //     conn.query("SELECT Id, Name FROM Account", function(err, result) {
    //         if (err) { return console.error(err); }
    //         console.log("total : " + result.totalSize);
    //         console.log("fetched : " + result.records.length);
    //     });
    // });
});

// app.post("/api/contacts", function(req, res) {

// });

// app.put("/api/contacts/:id", function(req, res) {

// });

// app.delete("/api/contacts/:id", function(req, res) {

// });
app.listen(process.env.PORT || 8080, () => {
    console.log(`Example app listening on port ${process.env.PORT}!`)
});