package Program_62 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Char) extends T_A[Boolean, Boolean]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A (CC_B Wildcard Wildcard Wildcard T_A)
//      (Tuple Wildcard
//             (CC_B Wildcard (CC_B Wildcard Wildcard Boolean T_A) Wildcard T_A))
//      T_A)