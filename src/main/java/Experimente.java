import java.util.List;
import java.util.Stack;

import com.exlibris.dps.Fixity;
import com.exlibris.dps.MetaData;
import com.exlibris.dps.Operation;
import com.exlibris.dps.RepresentationContent;

import de.zbmed.utilities.WebServices;

public class Experimente {

	private static long test1(String dateiname, String md5Hash) throws Exception {
		String repPid = "REP1493173";
		String iePid = "IE1493172";
		String rosettaInstance = "dev";
		List<RepresentationContent> representationContent = new Stack<>();
		RepresentationContent rc = new RepresentationContent();
		rc.setOperation(Operation.ADD);
		rc.setNewFile("/exchange/lza/lza-zbmed/dev/gms/" + dateiname);
		rc.setFileOriginalPath("SourceMD/" + dateiname);
		rc.setLabel("SourceMD/" + dateiname);
		Fixity fix = new Fixity();
		fix.setAlgorithmType("MD5");
		fix.setValue(md5Hash);
		rc.setFixity(fix);
		representationContent.add(rc);
		List<MetaData> metadata = null;
		String submissionReason = "Nur so2";

//		WebServices.lockIE(iePid, rosettaInstance);
		long ripID = WebServices.updateRepresentation(representationContent, metadata, repPid, iePid, rosettaInstance,
				true, submissionReason);
		return ripID;
	}

	public static void main(String[] args) throws Exception {
//		long ret = test1("test.txt", "fba6c08cc509f446c96ae32420894054");
		long ret = test1("OAI.xml", "6db5b1d0eebca2528de3299c2369195a");
		System.out.println("Experimente Ende. Return = " + ret);
	}
}
