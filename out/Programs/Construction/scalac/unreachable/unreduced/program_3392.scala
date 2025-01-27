package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, D], b: T_A[E, E], c: T_A[D, E]) extends T_A[E, D]
case class CC_B(a: T_B[T_A[Boolean, Boolean]], b: Int) extends T_A[T_B[CC_A[Int, Boolean]], T_B[T_A[Int, Boolean]]]
case class CC_C[F, G, H](a: F) extends T_A[F, G]
case class CC_D(a: T_A[(CC_B,CC_B), CC_C[CC_B, CC_B, CC_B]]) extends T_B[CC_B]
case class CC_E(a: T_A[T_B[CC_B], CC_A[CC_D, CC_D]]) extends T_B[CC_B]
case class CC_F() extends T_B[CC_B]

val v_a: T_A[T_B[CC_A[Int, Boolean]], T_B[T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, 12) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_B(_, _)