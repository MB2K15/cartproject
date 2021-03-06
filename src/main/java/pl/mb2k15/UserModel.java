package pl.mb2k15;

import javax.persistence.*;


@Table(name = "usermodel")
@Entity
public class UserModel {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;
    @Column
    private String usrName;
    @Column
    private String usrPasswd;
    @Column
    private String usrDesc;

    public UserModel() {
    }

    public UserModel(String usrName, String usrPasswd) {
        this.usrPasswd = usrPasswd;
        this.usrName = usrName;
    }

    public int getUsrId() {
        return userid;
    }

    public void setUsrId(int usrId) {
        this.userid = usrId;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrPasswd() {
        return usrPasswd;
    }

    public void setUsrPasswd(String usrPasswd) {
        this.usrPasswd = usrPasswd;
    }

    public String getUsrDesc() {
        return usrDesc;
    }

    public void setUsrDesc(String usrDesc) {
        this.usrDesc = usrDesc;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userid=" + userid +
                ", usrName='" + usrName + '\'' +
                ", usrPasswd='" + usrPasswd + '\'' +
                ", usrDesc='" + usrDesc + '\'' +
                '}';
    }
}
