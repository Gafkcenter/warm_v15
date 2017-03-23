package cn.itcast.web.action;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class ChartAction extends DispatchAction {
	
	public ActionForward column3D(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/text;charset=utf-8");
		PrintWriter out = response.getWriter();
		String str="<chart  caption='cd类别对照表'  subCaption='cd类别对照表'  " +
				" rotateYAxisName='0'  xAxisName='类别' yAxisName='数量'   maxColWidth='60' showValues='1'" +
				"  baseFontSize='18' formatNumberScale='1' shownames='1' > <set label='民乐' value='6' hoverText='民乐=6' />" +
				" <set label='流行音乐' value='8' /> <set label='外国歌曲' value='1' /> <set label='摇滚乐' value='6' /></chart>";
        out.println(str);
	
		return null;
	}
	
	public ActionForward pie3D(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/text;charset=utf-8");
		PrintWriter out = response.getWriter();
		/*
		 * <chart  caption='cd类别对照表' palette='4' decimals='0' enableSmartLabels='1' enableRotation='0' 
                   bgColor='99CCFF,FFFFFF' bgAlpha='40,100' bgRatio='0,100' 
                   bgAngle='360' showBorder='1' startingAngle='70' >
			        <set label='民乐' value='6'/>
		            <set label='流行音乐' value='8' />
		            <set label='外国歌曲' value='1'/>
		            <set label='摇滚乐' value='6'/>
          </chart>
		 */

		String str="<chart  caption='cd类别对照表' palette='4' decimals='0' enableSmartLabels='1' enableRotation='0' bgColor='99CCFF,FFFFFF' bgAlpha='40,100' bgRatio='0,100' baseFontSize='18'  bgAngle='360' showBorder='1' startingAngle='70' ><set label='民乐' value='6'/><set label='流行音乐' value='8' /><set label='外国歌曲' value='1'/><set label='摇滚乐' value='6'/></chart>";
        out.println(str);
	
		return null;
	}
	
	
}
