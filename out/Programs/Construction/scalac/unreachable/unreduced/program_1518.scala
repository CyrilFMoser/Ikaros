package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, C], c: T_B) extends T_A[C, T_A[C, C]]
case class CC_B(a: Int, b: CC_A[CC_A[T_B]], c: T_A[T_A[T_B, (Int,Boolean)], Char]) extends T_A[CC_A[T_A[T_B, T_B]], T_A[CC_A[T_A[T_B, T_B]], CC_A[T_A[T_B, T_B]]]]
case class CC_C[D](a: (CC_A[T_B],Char)) extends T_A[D, T_A[D, D]]
case class CC_D(a: T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]]) extends T_B
case class CC_E(a: T_A[CC_B, T_A[CC_B, CC_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_A(_, _, _)) => 1 
}
}
// This is not matched: CC_E(CC_C(_))