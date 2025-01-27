package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (Char,Byte), b: T_B[Char], c: T_A[Byte]) extends T_A[Byte]
case class CC_B() extends T_A[Byte]
case class CC_D() extends T_B[CC_A]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_D (T_A Boolean) (T_A Boolean) Wildcard (T_B (T_A Boolean) (T_A Boolean)))