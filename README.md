# Rescue Robot Project

## Description
โปรเจกต์นี้สาธิตการสืบทอดแบบหลายทางในภาษา Java โดยใช้อินเทอร์เฟซและการประกอบ (composition)

## How to Run
1. Java สืบทอดหลาย class ไม่ได้เพราะอะไร
ตอบ Java ไม่รองรับ multiple inheritance ของ class เพราะอาจเกิดปัญหา Diamond Problem
เมื่อ class ลูกได้รับ method ที่เหมือนกันจากหลาย class ทำให้เกิดความสับสนว่า
ควรใช้ method จาก class ใด

2. เราใช้ interface + composition แทนอย่างไร
ตอบ เมื่่อclass ลูกได้รับ method ที่เหมือนกันจากหลาย class ทำให้เกิดความสับสนว่า

3. อธิบายการแก้ปัญหา default method ชื่อชนกัน 
ตอบ ในโปรเจกต์นี้ RescueRobot ใช้ implements หลาย interface ได้แก่
Flyable, Drivable, ThermalSensor และ Communicable
เพื่อให้สามารถมีหลายความสามารถได้
และใช้ Composition โดยให้ RescueRobot มี object ภายใน ได้แก่
Battery, GPSTracker และ ThermalCamera
ซึ่งเป็นความสัมพันธ์แบบ has-a
Flyable.super.status()
Drivable.super.status()
เพื่อรวมผลลัพธ์เข้าด้วยกัน

## Author
ภิมวิธ ศรีถาวร

