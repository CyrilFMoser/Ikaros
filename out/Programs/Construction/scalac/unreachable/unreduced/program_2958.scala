package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: (T_A[Int, (Int,Int)],(T_B,T_B))) extends T_A[Int, C]
case class CC_B[D](a: T_A[Int, T_B]) extends T_A[Int, D]
case class CC_C(a: (T_A[Int, T_B],CC_A[T_B])) extends T_B
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C((CC_A(_, _),CC_A(_, _))) => 0 
  case CC_C((CC_B(_),CC_A(_, _))) => 1 
  case CC_E() => 2 
}
}
// This is not matched: CC_D()