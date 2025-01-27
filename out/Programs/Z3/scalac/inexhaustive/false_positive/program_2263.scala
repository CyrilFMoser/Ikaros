package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[(Byte,Char), T_B]) extends T_A[T_A[T_B, T_B], T_A[T_B, T_B]]
case class CC_D() extends T_B
case class CC_F() extends T_B

val v_a: T_A[T_A[T_B, T_B], T_A[T_B, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_F(), _) => 0 
}
}
// This is not matched: (CC_A Int Int (T_A Int Int))