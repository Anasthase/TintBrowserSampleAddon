package your.packagename;

import java.util.List;

import org.tint.addons.framework.Action;

import android.app.Service;
import android.os.RemoteException;

public class Addon extends BaseAddon {

	public Addon(Service service) {
		super(service);
	}

	@Override
	public int getCallbacks() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getContributedBookmarkContextMenuItem(String currentTabId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getContributedHistoryBookmarksMenuItem(String currentTabId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getContributedHistoryContextMenuItem(String currentTabId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getContributedLinkContextMenuItem(String currentTabId, int hitTestResult, String url) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getContributedMainMenuItem(String currentTabId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onBind() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Action> onContributedBookmarkContextMenuItemSelected(String currentTabId, String title, String url) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Action> onContributedHistoryBookmarksMenuItemSelected(String currentTabId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Action> onContributedHistoryContextMenuItemSelected(String currentTabId, String title, String url) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Action> onContributedLinkContextMenuItemSelected(String currentTabId, int hitTestResult, String url) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Action> onContributedMainMenuItemSelected(String currentTabId, String currentTitle, String currentUrl) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Action> onPageFinished(String tabId, String url) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Action> onPageStarted(String tabId, String url) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Action> onTabClosed(String tabId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Action> onTabOpened(String tabId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onUnbind() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Action> onUserAnswerQuestion(String currentTabId, String questionId, boolean positiveAnswer)	throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showAddonPreferenceActivity() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
