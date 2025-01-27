package Program_58 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: T_A[Char]) extends T_A[Byte]
case class CC_B() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B(), _) => 1 
}
}
// This is not matched: (CC_A (CC_C Wildcard (T_A Byte)) Wildcard (T_A Byte))