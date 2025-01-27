package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C, c: T_A[C, C]) extends T_A[Boolean, C]
case class CC_B[D](a: T_A[Boolean, D], b: Byte) extends T_A[Boolean, D]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_, 0) => 2 
  case CC_B(_, _) => 3 
}
}