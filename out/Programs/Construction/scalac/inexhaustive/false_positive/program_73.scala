package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_B[F, G](a: T_A[G, T_B[G, G]]) extends T_A[G, F]

val v_a: CC_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
}
}
// This is not matched: CC_B(((_,_),_), CC_B((_,_), CC_A(_, _, _)))