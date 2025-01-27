package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: T_A[Byte]) extends T_A[Byte]
case class CC_B() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A Boolean))