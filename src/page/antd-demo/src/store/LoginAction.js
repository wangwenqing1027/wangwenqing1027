import axios from 'axios'
import qs from 'qs'

/**
 * 后端交互工具类
 * 需要先安装axios，教程https://www.cnblogs.com/hackyo/p/7992174.html，因为前面安装了yarn，所以用yarn add axios命令进行
 */
export class LoginAction {
    LoginUrl = "http://localhost:8080/datou/login";

    submitLoginForm(param){
        return axios.post(this.LoginUrl,qs.stringify(param)).then((resp)=>{
            return resp.data;
        })
    }
}
