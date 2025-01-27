package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C, c: T_A[C, C]) extends T_A[C, T_A[Int, T_A[T_B, T_B]]]
case class CC_B[D](a: (Byte,Int)) extends T_A[D, T_A[Int, T_A[T_B, T_B]]]
case class CC_C(a: CC_B[CC_A[T_B]]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Byte, T_A[Int, T_A[T_B, T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_B(_)), 0, _) => 0 
  case CC_A(CC_D(), 0, _) => 1 
  case CC_A(CC_C(CC_B(_)), _, _) => 2 
  case CC_A(CC_D(), _, _) => 3 
  case CC_B((_,_)) => 4 
}
}