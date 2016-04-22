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

public class RIPcreateAssetResponse extends AttributeContainer implements KvmSerializable
{

    
    public String createAssetResult;
    
    public String newAssetHandle;
    
    public String newExtensionHandle;
    
    public String newExtensionName;

    public RIPcreateAssetResponse ()
    {
    }

    public RIPcreateAssetResponse (java.lang.Object paramObj,RIPExtendedSoapSerializationEnvelope __envelope)
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
                if (info.name.equals("createAssetResult"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.createAssetResult = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.createAssetResult = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("newAssetHandle"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.newAssetHandle = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.newAssetHandle = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("newExtensionHandle"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.newExtensionHandle = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.newExtensionHandle = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("newExtensionName"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.newExtensionName = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.newExtensionName = (String)obj;
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
            return createAssetResult;
        }
        if(propertyIndex==1)
        {
            return newAssetHandle;
        }
        if(propertyIndex==2)
        {
            return newExtensionHandle;
        }
        if(propertyIndex==3)
        {
            return newExtensionName;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "createAssetResult";
            info.namespace= "";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "newAssetHandle";
            info.namespace= "";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "newExtensionHandle";
            info.namespace= "";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "newExtensionName";
            info.namespace= "";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}