new Vue({
    el: '#app',
    data: {
        username: '',
        isUsernameRight: true,
        password: '',
        isPasswordRight: true,
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