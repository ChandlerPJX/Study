import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '@/components/MyLogin'
import Home from '@/components/MyHome'
import myUsers from '@/components/menus/MyUsers'
import myRights from '@/components/menus/MyRights'
import myGoods from '@/components/menus/MyGoods'
import myOrders from '@/components/menus/MyOrders'
import mySettings from '@/components/menus/MySettings'
import myUserDetail from '@/components/user/MyUserDetail'
import pathArr from '@/router/pathArr'

Vue.use(VueRouter)

const router = new VueRouter({
    routes: [
        {path: '/', redirect: '/Login'},
        {path: '/login', component: Login},
        {
            path: '/home', component: Home,
            redirect: '/home/users',
            children: [
                {path: 'users', component: myUsers},
                {path: 'rights', component: myRights},
                {path: 'goods', component: myGoods},
                {path: 'orders', component: myOrders},
                {path: 'settings', component: mySettings},
                // 用户详情路由规则
                {path: 'userInfo/:id', component: myUserDetail}
            ]
        }

    ]
})

router.beforeEach(function (to, from, next) {
    if (pathArr.indexOf(to.path) !== -1) {
        const token = localStorage.getItem('token')
        if (token) {
            // 放行
            next()
        } else {
            // 强制跳转
            next('/login')
        }
    } else {
        next()
    }
})
export default router
