import React, {Component} from 'react';
import {Form, Icon, Input, Button, Checkbox, Row, Col, Layout, Modal} from 'antd';
import './Login.css';
import {LoginAction} from "./store/LoginAction";

class NormalLoginForm extends React.Component {
    //因为渲染页面以后输入后触发这个handleSubmit事件进入这里。（=>箭头函数，匿名的方法）①触发这个方法 ②把输入的值塞进values里面 ③去掉用loginAction方法，并拿取返回值
    //handleSubmit是因为下面的行33行，触发的这个事件
    handleSubmit = (e) => {
        e.preventDefault();
        debugger;
        this.props.form.validateFields((err, values) => {
            if (!err) {
                let action = new  LoginAction();
                action.submitLoginForm(values).then((data)=>{
                    if(data.success == true){
                        Modal.info({
                            title:"登录结果",
                            content:"ok"
                        });
                    }else{
                        alert(data.failReason)
                    }
                });
            }
        });
    };
    
//渲染页面
    render() {
        const {getFieldDecorator} = this.props.form;
        return (
            <div>
                <Row>
                    <Col span={8} offset={8}>
                        <Form onSubmit={this.handleSubmit} className="login-form">
                            <Form.Item>
                                {getFieldDecorator('name', {
                                    rules: [{required: true, message: 'Please input your username!'}],
                                })(
                                    <Input
                                        prefix={<Icon type="user" style={{color: 'rgba(0,0,0,.25)'}}/>}
                                        placeholder="Username"
                                    />,
                                )}
                            </Form.Item>
                            <Form.Item>
                                {getFieldDecorator('password', {
                                    rules: [{required: true, message: 'Please input your Password!'}],
                                })(
                                    <Input
                                        prefix={<Icon type="lock" style={{color: 'rgba(0,0,0,.25)'}}/>}
                                        type="password"
                                        placeholder="Password"
                                    />,
                                )}
                            </Form.Item>
                            <Form.Item>
                                {getFieldDecorator('remember', {
                                    valuePropName: 'checked',
                                    initialValue: true,
                                })(<Checkbox>Remember me</Checkbox>)}
                                <a className="login-form-forgot" href="">
                                    Forgot password
                                </a>
                                {/*<Button type="primary" htmlType="submit" className="login-form-button">*/}
                                    {/*Log in*/}
                                {/*</Button>*/}

                                <Button type="danger" shape="circle" size="large" htmlType="button" onClick={this.handleSubmit}>
                                    登录
                                </Button>
                                
                                Or <a href="">register now!</a>
                            </Form.Item>
                        </Form>
                    </Col>
                </Row>
            </div>

        );
    }
}

const WrappedNormalLoginForm = Form.create({name: 'normal_login'})(NormalLoginForm);
export default WrappedNormalLoginForm
