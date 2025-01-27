package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[(Char,Boolean), E]
case class CC_B[G, F]() extends T_A[F, G]
case class CC_D() extends T_B[CC_A[Boolean], CC_B[CC_A[Boolean], CC_A[Boolean]]]
case class CC_E[I](a: T_B[CC_D, I], b: I) extends T_B[I, CC_B[I, I]]

val v_a: T_B[T_B[CC_A[Boolean], CC_B[CC_A[Boolean], CC_A[Boolean]]], CC_B[T_B[CC_A[Boolean], CC_B[CC_A[Boolean], CC_A[Boolean]]], T_B[CC_A[Boolean], CC_B[CC_A[Boolean], CC_A[Boolean]]]]] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_E(_, _)) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)