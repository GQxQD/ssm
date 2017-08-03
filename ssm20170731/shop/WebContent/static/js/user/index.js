new Vue({
    el: '#app',
    data: {
        user: {
            id: 0,
            username: '',
            gender: '',
            email: ''
        }
    },
    mounted: function () {
        this.$nextTick(function () {
            this.getUser();
        })
    },
    methods: {
        getUser: function () {
            var id = $.cookie('user_id');
            if (id == null) {
                alert('您尚未登录！');
                window.location.href = base_path + '/login.html';
                return;
            }
            this.$http.get(base_path + '/user/getUser.do?id=' + id).then(function (response) {
                var result = response.body;
                if (result.status === 0) {
                    this.user = result.data;
                } else {
                    alert('您尚未登录！');
                    window.location.href = base_path + '/login.html';
                    return;
                }
            })
        }
    }
});