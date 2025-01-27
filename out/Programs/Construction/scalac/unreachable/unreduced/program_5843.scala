package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Int, b: T_A[Char, T_A[Boolean, Int]]) extends T_A[Char, Int]
case class CC_B[E, F](a: T_A[CC_A, E], b: T_B[E, T_A[E, E]], c: E) extends T_B[F, E]
case class CC_C[G, H](a: G) extends T_B[G, H]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 0 
  case CC_B(_, CC_B(_, CC_C(_), _), _) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_B(_, CC_C(_), _)