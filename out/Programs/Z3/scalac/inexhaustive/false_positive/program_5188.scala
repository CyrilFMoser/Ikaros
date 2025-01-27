package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Int,Boolean)) extends T_A[B]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
}
}
// This is not matched: (CC_B (CC_B (CC_C T_A (Tuple Wildcard Wildcard) Wildcard T_A) Wildcard T_A)
//      Wildcard
//      T_A)