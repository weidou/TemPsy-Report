package lu.svv.offline.main;

import org.eclipse.emf.common.util.URI;

import lu.svv.offline.tempsy.TemPsyPackage;

public class XmiTemPsyLoader extends XmiResource implements ResourceLoader {

	private static XmiTemPsyLoader instance;
	@Override
	public Object load(String TemPsyFilePath) {
		register(TemPsyPackage.eNS_URI, TemPsyPackage.eINSTANCE);
		return getContent(URI.createURI(TemPsyFilePath), true);
	}
	
	private XmiTemPsyLoader(){
		super();
	}
	
	public static XmiTemPsyLoader init() {
		if (instance == null) {
			instance = new XmiTemPsyLoader();			
		}
		return instance;
	}

}

