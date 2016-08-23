UnicastRemoteObject example

1. Confirm /tmp/uro.ser doesn't exist
2. Show new SerializeUROExample.java
3. Create it with serialize.sh
4. Kill the process to end the listening socket
5. Confirm the /tmp/uro.ser was created
6. Show src/DeserializeUROExample.java
7. Deserialize /tmp/cake.ser
8. Confirm there is something listening on 6666

**Highlight that I had to modify the Deserializer not to expect a Cake
