package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_B[G](a: (Byte,Byte)) extends T_B[G, CC_A[Char, Int]]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B((0,_)) => 0 
}
}
// This is not matched: (CC_B (CC_C Boolean Boolean) Wildcard (T_A (CC_C Boolean Boolean)))