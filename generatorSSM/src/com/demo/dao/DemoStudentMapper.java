package com.demo.dao;

import com.demo.po.DemoStudent;
import com.demo.po.DemoStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DemoStudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_student
     *
     * @mbg.generated
     */
    long countByExample(DemoStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_student
     *
     * @mbg.generated
     */
    int deleteByExample(DemoStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_student
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long studentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_student
     *
     * @mbg.generated
     */
    int insert(DemoStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_student
     *
     * @mbg.generated
     */
    int insertSelective(DemoStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_student
     *
     * @mbg.generated
     */
    List<DemoStudent> selectByExample(DemoStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_student
     *
     * @mbg.generated
     */
    DemoStudent selectByPrimaryKey(Long studentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_student
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DemoStudent record, @Param("example") DemoStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_student
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DemoStudent record, @Param("example") DemoStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_student
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DemoStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_student
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DemoStudent record);
}