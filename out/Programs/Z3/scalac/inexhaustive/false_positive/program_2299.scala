package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B() extends T_A[T_B[Char], T_B[Int]]
case class CC_C(a: Int, b: T_A[CC_B, CC_B], c: T_B[Char]) extends T_B[Char]
case class CC_D() extends T_B[Char]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_D()) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard (T_A Byte))