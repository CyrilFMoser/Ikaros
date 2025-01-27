package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E]) extends T_A[(Boolean,Char), E]
case class CC_B[F](a: Char) extends T_A[(Boolean,Char), F]
case class CC_C[G](a: CC_A[G], b: G) extends T_A[(Boolean,Char), G]

val v_a: T_A[(Boolean,Char), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(CC_A(_, _), _)