package  server;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteServer extends Remote {

    String getRootPath() throws RemoteException;

    void addUser(String userName) throws RemoteException;

    boolean containsUser(String userName) throws RemoteException;

    int getChangesLength() throws RemoteException;

    String getMessage(int num) throws RemoteException;

    void addMessage(String message) throws RemoteException;

     void copy(String fromPathStr, String toPathStr) throws RemoteException;

    void move(String fromPathStr, String toPathStr) throws RemoteException;

    boolean isDirectoryExist(String pathStr) throws RemoteException;

     void makeDirectory(String pathStr) throws RemoteException;

     void block(String pathStr, String username) throws RemoteException;


    void unblock(String pathStr, String user) throws RemoteException;

    boolean isBlocked(String pathStr) throws RemoteException;

    String[] blockedBy(String pathStr) throws RemoteException;

     boolean removeDirectory(String pathStr) throws RemoteException;

     boolean removeDirectoryRecursive(String pathStr) throws RemoteException;

     void removeFile(String pathStr) throws RemoteException;

     void makeFile(String pathStr) throws RemoteException;

    String getDelimiter() throws RemoteException;

    String getFilesTree(String path) throws RemoteException;

    String[] getRoots() throws RemoteException;

    String[] getFilesInDirectory(String path) throws RemoteException;

    void removeUser(String userName) throws RemoteException;
}
