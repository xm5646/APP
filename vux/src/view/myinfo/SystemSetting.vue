<template>
  <div style="height: 100%;background-color: #ECECEC">
    <view-box body-padding-top="46px">
      <div v-if="true" slot="header" class="header-css"
           style="position: absolute;height: calc(40px + env(safe-area-inset-top));width:100%;left: 0;top: 0;background-color: rgb(50,112,222);z-index: 100">
        <x-header :left-options="{showBack: true,backText: ''}"
                  style="position: absolute;left:0;top: env(safe-area-inset-top);width: 100%;z-index: 100;">系统设置
        </x-header>
      </div>
      <group style="padding-top: env(safe-area-inset-top);">
        <cell title="账号与安全" is-link link="/my/systemSetting/securitySetting"></cell>
      </group>

      <group>
        <!--<cell title="帮助与反馈" is-link></cell>-->
        <cell title="关于IZone" is-link>版本1.0</cell>
      </group>

      <!--<group>-->
        <!--<cell title="退出登陆" style="text-align: center" @click.native="logout"></cell>-->
      <!--</group>-->

    </view-box>
  </div>
</template>

<script>
  import {XButton, Box, Divider, XHeader, Group, Cell, CellBox, XInput, ViewBox} from 'vux'

  export default {
    name: 'SecuritySetting',
    components: {
      XInput,
      ViewBox,
      XButton,
      XHeader,
      Box,
      Divider,
      Group,
      Cell,
      CellBox
    },
    mounted: function () {
      console.log(this.currentUser.id)
      let userObj = this.$db.get('User')
      this.currentUser.nickName = userObj.nickName
    },
    data () {
      return {
        msg: 'resetSetting page',
        showEdit: false,
        nickName: '李晓明',
        currentUser: {
          nickName: ''
        },
        editModel: {
          title: '设置昵称',
          currentEdit: 'nickName'
        }
      }
    },
    methods: {
      logout () {
        let homeObj1 = {
          headerStatus: false,
          nowView: 'wakuang'
        }
        this.$store.commit('updateHomeObj', homeObj1)
        window.localStorage.clear()
        window.sessionStorage.clear()
        this.$router.replace({'name': 'login'})
      }
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .header-css /deep/ .vux-header-title {
    color: white;
  }
  .header-css /deep/ .vux-header .vux-header-left .left-arrow:before {
    border: 1px solid white;
    border-width: 1px 0 0 1px;
  }
  .header-css /deep/ .vux-header {
    background-color: rgb(50,112,222);
  }
</style>
