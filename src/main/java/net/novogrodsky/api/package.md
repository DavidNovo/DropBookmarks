# Purpose
Representation classes are classes which, when handled to various Jersey MessageBodyReader and MessageBodyWriter providers, become the entities in your application’s API. Dropwizard heavily favors JSON, but it’s possible to map from any POJO to custom formats and back

These entities are passed to and from a client.
