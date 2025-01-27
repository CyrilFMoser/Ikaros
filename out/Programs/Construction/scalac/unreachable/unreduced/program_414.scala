package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, T_B[(Int,Int), T_A]], b: T_A) extends T_A
case class CC_B(a: Byte, b: Int, c: Byte) extends T_A
case class CC_C(a: Int) extends T_A
case class CC_D() extends T_B[(T_A,CC_C), CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_C(_)) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: CC_A(_, CC_B(_, _, _))