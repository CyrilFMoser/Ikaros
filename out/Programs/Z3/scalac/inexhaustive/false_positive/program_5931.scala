package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: T_A[Char], c: T_A[Char]) extends T_A[Char]
case class CC_C() extends T_A[Char]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C()) => 0 
}
}
// This is not matched: (CC_A Boolean
//      (CC_A Byte Wildcard Wildcard Wildcard (T_A Byte Boolean))
//      (CC_C Boolean (T_A Boolean Boolean))
//      (CC_A Boolean Wildcard Wildcard Wildcard (T_A Boolean Boolean))
//      (T_A Boolean Boolean))