package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Boolean, C]) extends T_A[Boolean, C]
case class CC_B[D](a: T_A[D, D]) extends T_A[Boolean, D]
case class CC_C(a: T_A[Boolean, Byte], b: Char, c: T_A[Boolean, CC_A[Byte]]) extends T_A[Boolean, T_A[Boolean, Boolean]]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
  case CC_B(_) => 2 
}
}