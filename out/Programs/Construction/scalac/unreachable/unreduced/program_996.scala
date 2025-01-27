package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, E], b: T_B[E], c: T_B[D]) extends T_A[D, E]
case class CC_B[F, G](a: Char, b: G) extends T_A[G, F]
case class CC_C[H, I](a: T_A[Boolean, I], b: I) extends T_A[H, I]
case class CC_D() extends T_B[T_A[CC_B[Byte, Boolean], T_A[Boolean, Boolean]]]
case class CC_E(a: T_A[T_A[CC_D, CC_D], T_A[CC_D, CC_D]], b: T_A[Byte, CC_D], c: CC_B[Byte, Byte]) extends T_B[T_A[CC_B[Byte, Boolean], T_A[Boolean, Boolean]]]
case class CC_F() extends T_B[T_A[CC_B[Byte, Boolean], T_A[Boolean, Boolean]]]

val v_a: T_B[T_A[CC_B[Byte, Boolean], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_A(_, _, _), _) => 0 
  case CC_E(_, CC_B(_, _), _) => 1 
  case CC_E(_, CC_C(_, _), _) => 2 
  case CC_F() => 3 
}
}
// This is not matched: CC_D()