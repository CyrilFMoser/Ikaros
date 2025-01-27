package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_B() extends T_A[T_B[Char, Byte]]
case class CC_D[G, F](a: G, b: T_A[G], c: T_B[G, G]) extends T_B[G, F]
case class CC_E[H, I]() extends T_B[H, I]

val v_a: T_B[CC_B, Char] = null
val v_b: Int = v_a match{
  case CC_E() => 0 
  case CC_D(_, _, CC_D(_, _, _)) => 1 
}
}
// This is not matched: (CC_E (CC_B Boolean) Char Wildcard Wildcard (T_B (CC_B Boolean) Char))