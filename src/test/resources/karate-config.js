function fn() {
    let env = karate.env; // Get the Java system property 'karate.env'
    karate.log('karate.env system property was:', env);
    if (!env) {
        env = 'dev'; // A custom 'intelligent' default
    }
    const config = {
        baseUrl: 'http://localhost:8080' // Define the base URL for your API tests
    };
    return config; // Return the configuration object
}
