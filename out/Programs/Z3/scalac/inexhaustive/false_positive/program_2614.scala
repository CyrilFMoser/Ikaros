package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: Byte, c: T_A[Char]) extends T_A[Char]
case class CC_B() extends T_A[Char]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_B Byte Int Wildcard Wildcard (T_A Byte Int))