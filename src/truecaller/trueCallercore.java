package truecaller;

import truecaller.Common.Call;
import truecaller.Common.Person;

public interface trueCallercore {
     Person identifyCall(Call call);
     void blockIncomingCall(Call call);
     boolean isSpam(Call call);
}
