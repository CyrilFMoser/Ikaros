package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (Byte,Byte)) extends T_A[T_B, T_B]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))