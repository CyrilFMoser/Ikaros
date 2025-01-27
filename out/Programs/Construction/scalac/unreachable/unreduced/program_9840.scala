package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Boolean, b: Byte) extends T_A[Boolean, Int]
case class CC_B(a: CC_A) extends T_A[Boolean, Int]
case class CC_C(a: Byte, b: T_A[CC_B, T_A[Boolean, Int]]) extends T_A[Boolean, Int]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_) => 2 
  case CC_C(_, _) => 3 
}
}