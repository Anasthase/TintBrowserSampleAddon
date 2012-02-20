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
	public String getContributedBookmarkContextMenuItem()
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getContributedHistoryBookmarksMenuItem()
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getContributedHistoryContextMenuItem() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getContributedLinkContextMenuItem(int arg0, String arg1)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getContributedMainMenuItem() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onBind() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Action> onContributedBookmarkContextMenuItemSelected(
			String arg0, String arg1) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Action> onContributedHistoryBookmarksMenuItemSelected()
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Action> onContributedHistoryContextMenuItemSelected(
			String arg0, String arg1) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Action> onContributedLinkContextMenuItemSelected(int arg0,
			String arg1) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Action> onContributedMainMenuItemSelected(String arg0,
			String arg1) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Action> onPageFinished(String arg0) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Action> onPageStarted(String arg0) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onUnbind() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Action> onUserAnswerQuestion(String arg0, boolean arg1)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showAddonPreferenceActivity() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
