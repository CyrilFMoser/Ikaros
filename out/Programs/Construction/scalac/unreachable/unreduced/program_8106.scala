package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: T_A[T_A[C, C], C], c: T_B) extends T_A[C, T_B]
case class CC_B(a: CC_A[(T_B,T_B)]) extends T_A[T_A[CC_A[Int], (T_B,T_B)], T_A[CC_A[T_B], T_B]]
case class CC_C(a: Byte) extends T_A[T_A[CC_A[Int], (T_B,T_B)], T_A[CC_A[T_B], T_B]]

val v_a: T_A[T_A[CC_A[Int], (T_B,T_B)], T_A[CC_A[T_B], T_B]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_C(_) => 1 
}
}