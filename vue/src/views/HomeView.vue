<template>
  <div id="building">

    <div class="home" style="height: 100%">
      <el-container style="height: 100%;">
        <el-aside width="sideWidth + 'px'" style="background-color: rgb(238, 241, 246); box-shadow: 2px 0 6px rgb(0 21 41 / 35%)">
          <el-menu :default-openeds="['1', '3']" style="min-height: 100%; overflow-x: hidden"
                   background-color="rgb(48,65,86)"
                   text-color="#fff"
                   active-text-color="#ffd04b"
                   :collapse-transition="false"
                   :collapse="isCollapse"
          >
            <div style="height: 60px; line-height: 60px; text-align: center">
              <img src="../assets/飞院logo.webp" alt="" style="width: 20px; position: relative; top: 5px; margin-right: 5px">
              <b style="color: white" v-show="logoTextShow">中国民用航空飞行学院</b>
            </div>

            <el-menu-item index="1">
              <i class="el-icon-message"></i>
              <span slot="title">消息</span>
            </el-menu-item>

            <el-submenu index="2">
              <template slot="title">
                <i class="el-icon-menu"></i>
                <span slot="title">应用</span>
              </template>
              <el-submenu index="2-1">
                <template slot="title">生活服务</template>
                <el-menu-item index="2-1-1">图书馆系统</el-menu-item>
                <el-menu-item index="2-1-2">学生请假</el-menu-item>
              </el-submenu>
              <el-submenu index="2-2">
                <template slot="title">教务服务</template>
                <el-menu-item index="2-2-1">我的课表</el-menu-item>
                <el-menu-item index="2-2-2">成绩查询</el-menu-item>
                <el-menu-item index="2-2-3">自主选课</el-menu-item>
              </el-submenu>
              <el-submenu index="2-3">
                <template slot="title">财务服务</template>
                <el-menu-item index="2-3-1">财务缴费</el-menu-item>
              </el-submenu>
            </el-submenu>

            <el-menu-item index="3">
              <i class="el-icon-setting"></i>
              <span slot="title">设置</span>
            </el-menu-item>

          </el-menu>

        </el-aside>

        <el-container>
          <el-header style="font-size: 12px; border-bottom: 1px solid #ccc; line-height: 60px; display: flex; background-color: whitesmoke;">
            <div style="flex: 1; font-size: 18px">
              <span :class="collapseBtnClass" style="cursor: pointer" @click="collapse"></span>
            </div>
              <el-dropdown style="width: 120px; cursor: pointer">
            <span>
              <img src="../assets/委屈小熊.webp" alt="" style="width: 40px; position: relative; top: 10px; margin-right: 5px">
              用户名
              <i class="el-icon-arrow-down" style="margin-left: 5px"></i>
            </span>
                <el-dropdown-menu slot="dropdown">
                  <el-dropdown-item>
<!--                    个人中心-->
                    <a href="about">个人中心</a>
                  </el-dropdown-item>
                  <el-dropdown-item>安全退出</el-dropdown-item>
                </el-dropdown-menu>
              </el-dropdown>
          </el-header>

          <br>
          <div style="text-align: center; border:solid;border-radius: 30px">
            <br> <h3>公告栏</h3> <br>
            <el-carousel :interval="4000" type="card" height="400px" style="size: auto">
              <el-carousel-item v-for="item in 6" :key="item">
                <div style="background-color: #E0E0E0">
                  <h3 class="medium">{{ item }}此处写公告信息</h3>
                </div>
                <div> <!--为排版美观使用16:9图片-->
                  <img src="../assets/约战1.png" alt="" style="max-width: 100%; max-height: 100%; position: relative;">
                </div>
              </el-carousel-item>
            </el-carousel>
          </div>


        </el-container>
      </el-container>
    </div>

  </div>

</template>

<style>
.el-carousel__item h3 {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 20px;
  margin: 0;
}

.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n+1) {
  background-color: #d3dce6;
}
</style>

<script>
export default {
  name: 'HomeView',
  data() {
    return {
      collapseBtnClass: 'el-icon-s-fold',
      isCollapse: false,
      sideWith: 220,
      logoTextShow: true,
    };
  },
  methods: {
    collapse(){ //点击收缩按钮触发
      this.isCollapse = !this.isCollapse;
      if (this.isCollapse){ //收缩
        this.sideWith = 64;
        this.collapseBtnClass = 'el-icon-s-unfold';
        this.logoTextShow = false;
      } else { //展开
        this.sideWith = 220;
        this.collapseBtnClass = 'el-icon-s-fold';
        this.logoTextShow = true;
      }
    },



  }
}
</script>
