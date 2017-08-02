new Vue({
    el: '#app',
    data: {
        username: '',
        isUsernameRight: true,
        password: '',
        isPasswordRight: true,
        password2: '',
        isPassword2Right: true
    },
    methods: {
        register: function () {
            if (this.isUsernameRight && this.isPasswordRight && this.isPassword2Right) {
                this.$http.post(base_path + '/user/register.do', {
                    username: this.username,
                    password: this.password
                }, {emulateJSON: true}).then(function (response) {
                    if (response.ok) {
                        var result = response.body;
                        switch (result.status) {
                            case 0:
                                alert('注册成功！');
                                window.location.href = 'login.html';
                                break;
                            default:
                                alert(result.msg);
                        }
                    } else {
                        alert('请求出错！code:' + response.status);
                    }
                }, function (response) {
                    alert('请求出错！code:' + response.status);
                });
            }
        }
    },
    computed: {
        usernameHint: function () {
            this.isUsernameRight = false;
            if (this.username == '') {
                return '用户名不能为空！';
            } else if (this.username.length < 3 || this.username.length > 10) {
                return '用户名必须在3-10字符之间！';
            } else {
                this.isUsernameRight = true;
                return '';
            }
        },
        passwordHint: function () {
            this.isPasswordRight = false;
            if (this.password == '') {
                return '密码不能为空！';
            } else if (this.password.length < 6 || this.password.length > 20) {
                return '密码必须在6-20字符之间！';
            } else {
                this.isPasswordRight = true;
                return '';
            }
        },
        password2Hint: function () {
            this.isPassword2Right = false;
            if (this.password == '') {
                return '确认密码不能为空！';
            } else if (this.password2 != this.password) {
                return '两次密码输入不一致！';
            } else {
                this.isPassword2Right = true;
                return '';
            }
        }
    }
});
