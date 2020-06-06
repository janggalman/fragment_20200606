package kr.tjoeun.fragment_20200606.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.tjoeun.fragment_20200606.fragments.FirstFragment
import kr.tjoeun.fragment_20200606.fragments.SecondFragment
import kr.tjoeun.fragment_20200606.fragments.ThirdFragment

class MyViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
//어떤 프래그먼트를 보여줄지 객체화 해서 리턴
        if (position == 0) {
            return FirstFragment()
        }
        else if (position == 1) {
            return SecondFragment()
        }
        else {
            return ThirdFragment()
        }

    }

    override fun getCount(): Int {
//        총 몇페이지가 필요한지 카운트 리턴
        return 3

    }
}