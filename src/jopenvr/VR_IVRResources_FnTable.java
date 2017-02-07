package jopenvr;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VR_IVRResources_FnTable extends Structure {
	public VR_IVRResources_FnTable.LoadSharedResource_callback LoadSharedResource;
	public VR_IVRResources_FnTable.GetResourceFullPath_callback GetResourceFullPath;
	public interface LoadSharedResource_callback extends Callback {
		int apply(Pointer pchResourceName, Pointer pchBuffer, int unBufferLen);
	};
	public interface GetResourceFullPath_callback extends Callback {
		int apply(Pointer pchResourceName, Pointer pchResourceTypeDirectory, Pointer pchPathBuffer, int unBufferLen);
	};
	public VR_IVRResources_FnTable() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("LoadSharedResource", "GetResourceFullPath");
	}
	public VR_IVRResources_FnTable(VR_IVRResources_FnTable.LoadSharedResource_callback LoadSharedResource, VR_IVRResources_FnTable.GetResourceFullPath_callback GetResourceFullPath) {
		super();
		this.LoadSharedResource = LoadSharedResource;
		this.GetResourceFullPath = GetResourceFullPath;
	}
	public VR_IVRResources_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRResources_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRResources_FnTable implements Structure.ByValue {
		
	};
}
