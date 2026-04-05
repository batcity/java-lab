# Try-With-Resources:

Try with Resources is a try statement that declares one or more resources, within this specific context a resource is an object that must be closed after the program is done with it (Examples include: Network connection, File streams, Database connections)

The benefit of this statement is that it protects against the possibility that the dev might forget to close a resource like a file stream, forgetting to close a resource is bad since the OS only has a limited pool of such connections to offer