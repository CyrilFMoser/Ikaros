package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, E], b: (Boolean,Int)) extends T_A[F, E]
case class CC_B[G]() extends T_B[G, T_A[Boolean, Byte]]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,12)) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)