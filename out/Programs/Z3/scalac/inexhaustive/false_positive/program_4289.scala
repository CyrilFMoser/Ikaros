package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[C, T_A[C, C]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Boolean
//      Wildcard
//      (CC_A Boolean
//            Wildcard
//            (CC_B Boolean Wildcard Wildcard Wildcard (T_A Boolean Boolean))
//            (T_A Boolean Boolean))
//      Wildcard
//      (T_A Boolean Boolean))