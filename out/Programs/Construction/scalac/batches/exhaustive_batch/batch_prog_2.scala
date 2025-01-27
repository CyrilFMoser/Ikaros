package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_B[Int]
case class CC_C(a: T_B[T_B[Int]], b: (T_A,CC_B)) extends T_B[Int]
case class CC_D(a: CC_A, b: CC_C, c: Byte) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
  case CC_D(CC_A(), CC_C(_, (_,_)), _) => 2 
}
}