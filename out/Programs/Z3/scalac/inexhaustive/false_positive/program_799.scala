package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_C[G](a: (Int,Char)) extends T_A[G, T_A[G, G]]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C((_,'x')) => 0 
}
}
// This is not matched: (CC_A Char Wildcard Wildcard Wildcard (T_A Char))