package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Char,Byte)) extends T_A[Byte]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_D (T_A Boolean) (T_A Boolean) Wildcard (T_B (T_A Boolean) (T_A Boolean)))