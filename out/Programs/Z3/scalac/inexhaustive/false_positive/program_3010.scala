package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[F, E]() extends T_A[F, E]
case class CC_C[G](a: CC_B[G, G], b: T_A[G, G]) extends T_A[G, (Int,Byte)]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B()) => 0 
}
}
// This is not matched: (CC_B Byte Boolean (Tuple Wildcard Int) Wildcard (T_A Boolean Byte))