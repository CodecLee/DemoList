package com.demo.po;

public class DemoStudentItem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo_student_item.item_id
     *
     * @mbg.generated
     */
    private Long itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo_student_item.course_id
     *
     * @mbg.generated
     */
    private Long courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo_student_item.student_id
     *
     * @mbg.generated
     */
    private Long studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo_student_item.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo_student_item.item_id
     *
     * @return the value of demo_student_item.item_id
     *
     * @mbg.generated
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo_student_item.item_id
     *
     * @param itemId the value for demo_student_item.item_id
     *
     * @mbg.generated
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo_student_item.course_id
     *
     * @return the value of demo_student_item.course_id
     *
     * @mbg.generated
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo_student_item.course_id
     *
     * @param courseId the value for demo_student_item.course_id
     *
     * @mbg.generated
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo_student_item.student_id
     *
     * @return the value of demo_student_item.student_id
     *
     * @mbg.generated
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo_student_item.student_id
     *
     * @param studentId the value for demo_student_item.student_id
     *
     * @mbg.generated
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo_student_item.remark
     *
     * @return the value of demo_student_item.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo_student_item.remark
     *
     * @param remark the value for demo_student_item.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}