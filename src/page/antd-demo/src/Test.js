import React, { Component } from 'react';
import {Button} from "antd";
import './Test.css'

/**
 * ①第一行是固定格式
 * ②export（出口的意思）代表提供外部使用
 * ③每个页面都是一个类，所以用class修饰
 * ④继承compnent也是固定格式
 * ⑤render是渲染页面
 * ⑥return表示返回的方法
 * 如下：
 * import React, { Component } from 'react';
 * export class Test extends Component{

    render(){
        return <div>

        </div>
    }
}
 */

export class Test extends Component{

    render(){
        return <div>
            <h2>登录</h2>
            <br/>
            用户名<input/>
            <br/>
            密  码<input/>
            <br/>
            <Button type="primary" htmlType="submit" className="login-form-button">
                登录
            </Button>
            <br/>
        </div>
    }
}