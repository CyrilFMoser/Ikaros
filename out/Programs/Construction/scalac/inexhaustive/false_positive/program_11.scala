package Program_63 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_D[C](a: T_B[C, C], b: T_A) extends T_B[Byte, C]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B()) => 0 
}
}
// This is not matched: CC_A(_, CC_D(_, _))