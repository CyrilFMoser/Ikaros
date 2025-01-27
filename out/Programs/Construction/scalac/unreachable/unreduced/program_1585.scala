package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_B[(T_A,Byte)]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_A, b: CC_A, c: CC_B) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_B(_)) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _))