package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_B[G](a: (Byte,Boolean)) extends T_A[G, CC_A[Byte, Int]]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B((0,_)) => 0 
}
}
// This is not matched: (CC_A T_A)