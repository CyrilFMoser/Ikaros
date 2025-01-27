package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[((Int,Int),(Int,Int))]) extends T_A[T_B[T_A[Byte]]]
case class CC_B(a: T_B[T_B[CC_A]]) extends T_B[CC_A]
case class CC_C(a: Byte, b: Byte, c: T_B[CC_A]) extends T_B[CC_A]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, 0, CC_B(_)) => 0 
  case CC_C(_, _, CC_B(_)) => 1 
  case CC_C(_, 0, CC_C(_, _, _)) => 2 
}
}
// This is not matched: CC_C(_, _, CC_C(_, _, _))