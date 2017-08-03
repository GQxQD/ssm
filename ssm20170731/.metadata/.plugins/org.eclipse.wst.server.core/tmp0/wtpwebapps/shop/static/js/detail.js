new Vue({
    el: '#app',
    data: {
        count: 1,
        stock: 9999
    },
    methods: {
        countDown: function () {
            this.count = this.count <= 1 ? 1 : this.count - 1;
        },
        countUp: function () {
            this.count = this.count == this.stock ? this.stock : this.count + 1;
        }
    }
});