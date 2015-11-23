# resource-server-template
Template for OAuth resource servers in Spring Boot.

Just one simple endpoint. 
Serving value of cf.resource property, which can be retrieved from sso service if bound. 
See application.yml for details.

App summary

- Serving OAUTH protected endpoint /rest/resource

Since the endpoint is oauth protected, you need oauth-token to avoid 401 response.
Get the token by typing command: cf oauth-token
To test endpoint, use web browser with Modify Headers plugin.  

Your extra header entry should look like this: 

Authentication: bearer ...very_long_token_here...

- Sample protected endpoint '/rest/resource' response content is retrieved from property demo.data.

- Sample open endpoint '/rest/open' is serving static string.

