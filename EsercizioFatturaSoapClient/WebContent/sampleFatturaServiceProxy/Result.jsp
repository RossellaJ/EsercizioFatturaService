<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleFatturaServiceProxyid" scope="session" class="it.alfasoft.rossella.FatturaServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleFatturaServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleFatturaServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleFatturaServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        it.alfasoft.rossella.FatturaService getFatturaService10mtemp = sampleFatturaServiceProxyid.getFatturaService();
if(getFatturaService10mtemp == null){
%>
<%=getFatturaService10mtemp %>
<%
}else{
        if(getFatturaService10mtemp!= null){
        String tempreturnp11 = getFatturaService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String codiceCliente_1id=  request.getParameter("codiceCliente22");
            java.lang.String codiceCliente_1idTemp = null;
        if(!codiceCliente_1id.equals("")){
         codiceCliente_1idTemp  = codiceCliente_1id;
        }
        it.alfasoft.rossella.Fattura prendiFatturaConCodice13mtemp = sampleFatturaServiceProxyid.prendiFatturaConCodice(codiceCliente_1idTemp);
if(prendiFatturaConCodice13mtemp == null){
%>
<%=prendiFatturaConCodice13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">importo:</TD>
<TD>
<%
if(prendiFatturaConCodice13mtemp != null){
%>
<%=prendiFatturaConCodice13mtemp.getImporto()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ragioneSociale:</TD>
<TD>
<%
if(prendiFatturaConCodice13mtemp != null){
java.lang.String typeragioneSociale18 = prendiFatturaConCodice13mtemp.getRagioneSociale();
        String tempResultragioneSociale18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeragioneSociale18));
        %>
        <%= tempResultragioneSociale18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">codiceCliente:</TD>
<TD>
<%
if(prendiFatturaConCodice13mtemp != null){
java.lang.String typecodiceCliente20 = prendiFatturaConCodice13mtemp.getCodiceCliente();
        String tempResultcodiceCliente20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodiceCliente20));
        %>
        <%= tempResultcodiceCliente20 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 24:
        gotMethod = true;
        java.lang.Object[] prendiTutteFatture24mtemp = sampleFatturaServiceProxyid.prendiTutteFatture();
if(prendiTutteFatture24mtemp == null){
%>
<%=prendiTutteFatture24mtemp %>
<%
}else{
        String tempreturnp25 = null;
        if(prendiTutteFatture24mtemp != null){
        java.util.List listreturnp25= java.util.Arrays.asList(prendiTutteFatture24mtemp);
        tempreturnp25 = listreturnp25.toString();
        }
        %>
        <%=tempreturnp25%>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>