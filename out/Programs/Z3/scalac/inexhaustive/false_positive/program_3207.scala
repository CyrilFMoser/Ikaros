package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: T_A[(Byte,Char)], c: T_A[Char]) extends T_A[Char]
case class CC_B() extends T_A[Char]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_C Boolean
//      Wildcard
//      (Tuple Char Wildcard)
//      (CC_A Boolean (T_A Boolean))
//      (T_B Boolean))