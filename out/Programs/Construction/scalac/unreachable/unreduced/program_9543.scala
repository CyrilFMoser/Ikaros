package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[E, E], c: T_B[E, E]) extends T_A[(T_A[Boolean, Char],Byte), E]
case class CC_B[F](a: T_A[F, F]) extends T_A[(T_A[Boolean, Char],Byte), F]
case class CC_C[G](a: G, b: CC_B[G], c: CC_B[G]) extends T_B[G, Int]
case class CC_D[H](a: H) extends T_B[Char, H]
case class CC_E[J, I](a: Boolean, b: T_B[I, I], c: Boolean) extends T_B[J, I]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B(_)) => 0 
  case CC_D(_) => 1 
  case CC_E(_, CC_C(_, CC_B(_), _), _) => 2 
  case CC_E(_, CC_E(_, CC_C(_, _, _), _), _) => 3 
  case CC_E(_, CC_E(_, CC_E(_, _, _), _), _) => 4 
}
}