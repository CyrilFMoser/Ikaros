package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D], c: T_A[D, D]) extends T_A[(T_A[Char, Boolean],Char), D]
case class CC_B[E](a: E) extends T_A[(T_A[Char, Boolean],Char), E]
case class CC_C[F](a: Boolean, b: F) extends T_A[(T_A[Char, Boolean],Char), F]
case class CC_D[G](a: T_B[G], b: (CC_C[Char],T_B[Int]), c: Boolean) extends T_B[G]
case class CC_E[H](a: CC_A[H], b: CC_D[H], c: CC_B[H]) extends T_B[H]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _, _), (_,_), _) => 0 
  case CC_D(CC_E(_, _, _), (_,_), _) => 1 
  case CC_E(CC_A(_, _, _), _, CC_B(_)) => 2 
}
}