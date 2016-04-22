package com.example.USD_WebServices;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.1.12.0
//
// Created by Quasar Development at 21/04/2016
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class RIPcreateObjectResponse extends AttributeContainer implements KvmSerializable
{

    
    public String createObjectResult;
    
    public String newHandle;

    public RIPcreateObjectResponse ()
    {
    }

    public RIPcreateObjectResponse (java.lang.Object paramObj,RIPExtendedSoapSerializationEnvelope __envelope)
    {
	    
	    if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;


        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                //if you have compilation error here, please use a ksoap2.jar and ExKsoap2.jar from libs folder (in the generated zip file)
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                java.lang.Object obj = info.getValue(); 
                if (info.name.equals("createObjectResult"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.createObjectResult = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.createObjectResult = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("newHandle"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.newHandle = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.newHandle = (String)obj;
                        }
                    }
                    continue;
                }

            }

        }



    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return createObjectResult;
        }
        if(propertyIndex==1)
        {
            return newHandle;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "createObjectResult";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "newHandle";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
