new Vue({
    el: '#app',
    data: {
        username: '',
        isUsernameRight: true,
        password: '',
        isPasswordRight: true,
    },
    methods: {
        login: function () {
            if (this.isUsernameRight && this.isPasswordRight) {
                this.$http.post(base_path + '/user/login.do', {
                    username: this.username,
                    password: this.password
                }, {emulateJSON: true}).then(function (response) {
                    if (response.ok) {
                        var result = response.body;
                        switch (result.status) {
                            case 0:
                                alert('登录成功！');
                                $.cookie('user_id', result.data.user_id);
                                $.cookie('token_key', result.data.token_key);
                                window.location.href = base_path + '/user';
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
                return '填写正确！';
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
                return '填写正确！';
            }
        }
    }
});