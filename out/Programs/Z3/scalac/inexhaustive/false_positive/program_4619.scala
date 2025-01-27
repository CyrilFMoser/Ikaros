package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: Boolean, c: T_A[Byte]) extends T_A[Byte]
case class CC_B() extends T_A[Byte]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A (CC_B (T_A Byte)) Wildcard Wildcard (T_A Byte))