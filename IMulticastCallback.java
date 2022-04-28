public interface IMulticastCallback {
    void onStarted();
    void onStopped();
    void onReceived(byte[] data);
}
