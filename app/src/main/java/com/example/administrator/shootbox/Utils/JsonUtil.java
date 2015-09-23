package com.example.administrator.shootbox.Utils;


import com.example.administrator.shootbox.model.PersonInfo;
import com.example.administrator.shootbox.model.UserAbility;
import com.example.administrator.shootbox.model.UserBase;
import com.example.administrator.shootbox.model.UserPlayer;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * ************************************************************************
 * Created: 杨艳凯
 * Date:    2015/8/10
 * Project: Shootbox
 * Version: 1.0
 * *************************************************************************
 */
public class JsonUtil {
    /**
     *
     * @param strResult   两级Json
     * @return PersonInfo
     */
    public static PersonInfo parseJson(String strResult) {

        PersonInfo m_personInfo=new PersonInfo();      // 临时变量用于返回结果  PersonInfo

        int m_id=0;
        String m_cName=null;
        JSONArray m_infoUserBase=null;
        JSONArray m_infoUserPlayer=null;
        JSONArray m_infoUserAbility=null;

        try{
            JSONObject jsonObject=new JSONObject(strResult);
            m_id=jsonObject.getInt("id");
            m_cName=jsonObject.getString("cName");
            m_infoUserBase=jsonObject.getJSONArray("info_user_base");
            m_infoUserPlayer=jsonObject.getJSONArray("info_user_player");
            m_infoUserAbility=jsonObject.getJSONArray("info_user_ability");

        }catch (JSONException e) {
            e.printStackTrace();
        }

        m_personInfo.id=m_id;
        m_personInfo.strName=m_cName;
        m_personInfo.userBase=parseJsonBase(m_infoUserBase);
        m_personInfo.userAbility=parseJsonAbility(m_infoUserAbility);
        m_personInfo.userPlayer=parseJsonPlayer(m_infoUserPlayer);

        return m_personInfo;
    }


    /**
     *
     * @param infoUserBase
     * @return  单个 userBase。   此处用户信息是单个的，只要返回单个 json 解析结果即可
     */
    public static UserBase parseJsonBase(JSONArray infoUserBase) {

        for (int i = 0; i < infoUserBase.length(); i++)
        {
            try
            {
                UserBase userBase=new UserBase();
                JSONObject jsonObject = (JSONObject) infoUserBase.get(i);

                userBase.strPwd=jsonObject.getString("cPwd");
                userBase.strTel=jsonObject.getString("cTel");
                userBase.srtEmail=jsonObject.getString("cEmail");
                userBase.nType=jsonObject.getInt("cType");

                userBase.nCity=jsonObject.getInt("cCity");
                userBase.nSex=jsonObject.getInt("nSex");
                userBase.nAge=jsonObject.getInt("nAge");
                userBase.nWeight=jsonObject.getInt("nWeight");

                userBase.nHeight=jsonObject.getInt("nHeight");
                userBase.blobPicture=jsonObject.getString("blobPicture");
                userBase.strProfile=jsonObject.getString("textProfile");


                return userBase;
            } catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return null;
    }


    /**
     *
     * @param infoUserAbility
     * @return  单个 userAbility。   此处用户信息是单个的，只要返回单个 json 解析结果即可
     */
    public static UserAbility parseJsonAbility(JSONArray infoUserAbility) {

        for (int i = 0; i < infoUserAbility.length(); i++)
        {
            try
            {
                UserAbility userAbility=new UserAbility();
                JSONObject jsonObject = (JSONObject) infoUserAbility.get(i);

                userAbility.nAttack=jsonObject.getInt("nAttack");
                userAbility.nDefense=jsonObject.getInt("nDefense");
                userAbility.nSpeed=jsonObject.getInt("nSpeed");
                userAbility.nPower=jsonObject.getInt("nPower");

                userAbility.nTechnology=jsonObject.getInt("nTechnology");
                userAbility.nStamina=jsonObject.getInt("nStamina");
                userAbility.nTeamwork=jsonObject.getInt("nTeamwork");
                userAbility.nPassing=jsonObject.getInt("nPassing");

                userAbility.nCompetition=jsonObject.getInt("nCompetition");
                userAbility.nShooting=jsonObject.getInt("nShooting");
                userAbility.nShortPass=jsonObject.getInt("nShortPass");
                userAbility.nLongPass=jsonObject.getInt("nLongPass");

                userAbility.nCrarrying=jsonObject.getInt("nCrarrying");
                userAbility.nHeading=jsonObject.getInt("nHeading");
                userAbility.nSkillful=jsonObject.getInt("nSkillful");
                userAbility.nCombat=jsonObject.getInt("nCombat");

                userAbility.nInverse=jsonObject.getInt("nInverse");
                userAbility.nStateHolding=jsonObject.getInt("nStateHolding");
                userAbility.strProfile=jsonObject.getString("textProfile");

                return userAbility;
            } catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     *
     * @param infoUserPlayer
     * @return  单个 userPlayer。   此处用户信息是单个的，只要返回单个 json 解析结果即可
     */
    public static UserPlayer parseJsonPlayer(JSONArray infoUserPlayer) {
        for (int i = 0; i < infoUserPlayer.length(); i++)
        {
            try
            {
                UserPlayer userPlayer=new UserPlayer();
                JSONObject jsonObject = (JSONObject) infoUserPlayer.get(i);

                userPlayer.nLevel=jsonObject.getInt("nLevel");
                userPlayer.nSimilarStar=jsonObject.getInt("nSimilarStar");
                userPlayer.strNickName=jsonObject.getString("cNickName");
                userPlayer.nTeam=jsonObject.getInt("nTeam");

                userPlayer.strIsLeader=jsonObject.getString("bIsLeader");
                userPlayer.nFieldPos=jsonObject.getInt("nFieldPos");
                userPlayer.nBackNo=jsonObject.getInt("nBackNo");
                userPlayer.nStatus=jsonObject.getInt("nStatus");

                userPlayer.nMatchTotal=jsonObject.getInt("nMatchTotal");
                userPlayer.fAttendPercent=jsonObject.getInt("fAttendPercent");

                return userPlayer;
            } catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return null;
    }

}
