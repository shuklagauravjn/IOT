// Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
// TembooSession session = new TembooSession("accountName", "myFirstApp", "abc123xxxxxxxxxxxxxx");

GeocodeByAddress geocodeByAddressChoreo = new GeocodeByAddress(session);

// Get an InputSet object for the choreo
GeocodeByAddressInputSet geocodeByAddressInputs = geocodeByAddressChoreo.newInputSet();

// Set credential to use for execution
geocodeByAddressInputs.setCredential("Gaurav");

// Set inputs

// Execute Choreo
GeocodeByAddressResultSet geocodeByAddressResults = geocodeByAddressChoreo.execute(geocodeByAddressInputs);