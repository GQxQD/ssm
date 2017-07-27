new Vue({
    el: '#shop',
    data: {
        list: null
    },
    mounted: function () {
        // var _this = this;
        this.$nextTick(function () {
            this.getGoodsList();
        })
    },
    methods: {
        getGoodsList: function () {
            this.$http.get('/shop/goods/list.html').then(function (response) {
                console.log(response);
                this.list = response.body;
            });
        }
    }
});

new Vue({
   el:'#addGoodsModal',
   methods:{
       addGoods:function () {
           //var formData = new FormData(document.getElementById('add-goods-form'));
           // this.$http.get('/shop/goods/add.html',{'title':'title'}).then(function (response) {
           //     console.log(response);
           // });
           // this.$http({
           //     method:'get',
           //     data:{title:'title'},
           //     url:'/shop/goods/add.html'
           // }).then(function (response) {
           //     console.log(response);
           // });
           $.ajax({
               url:'/shop/goods/add.html',
               data:{title:'title'},
               dataType:'json',
               success:function (data) {
                   console.log(data);
               }
           });
       }
   }
});

// goodsList.list = [{
//     "category": 0,
//     "description": "金罐加多寶，还是原来的配方，还是熟悉的味道！",
//     "id": 1,
//     "img": "",
//     "price": 0,
//     "stock": 0,
//     "title": "加多寶"
// }, {
//     "category": 100,
//     "description": "还是原来的配方，还是熟悉的味道！",
//     "id": 3,
//     "img": "",
//     "price": 4.5,
//     "stock": 500,
//     "title": "王老吉"
// }];