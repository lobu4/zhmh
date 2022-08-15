<template>
  <div>
    <div id="student" style="text-align: center" v-if="user.sid">
      <br/><h1>用户信息</h1><br/>
      <h2>学号:{{user.sid}}</h2><br/>
      <h2>姓名:{{user.name}}</h2><br/>
      <h2>性别:{{user.gender}}</h2><br/>
      <h2>年龄:{{user.age}}</h2><br/>
      <h2>专业:{{user.major}}</h2><br/>
      <h2>年级:{{user.grade}}</h2><br/>
      <h2>班级:{{user.classname}}</h2><br/>
      <h2>生源地:{{user.origin}}</h2><br/>
      <h2>邮箱:{{user.mail}}</h2><br/>
    </div>

    <div id="teacher" style="text-align: center">

    </div>
  </div>
</template>

<script>
export default {
  name: "User",
  data() {
    return {
      user: null
    }
  },
  created(){
    //请求查询数据
    fetch("http://localhost:8081/student/findStudentById?id=1").then(res => res.json()).then(res =>{
      console.log(res);
      this.user = res
    })
  },
}
</script>

<style scoped>

</style>
