package Program_31 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: (T_A,T_A)) extends T_A
case class CC_B() extends T_A
case class CC_C[B, C]() extends T_B[B]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C Char T_A (T_B Char))
// This is not matched: (CC_C (CC_B Boolean Boolean Boolean (T_A Boolean Boolean))
//      Wildcard
//      (CC_E (CC_B Boolean Boolean Boolean Boolean)
//            (T_B (CC_B Boolean Boolean Boolean Boolean)))
//      Wildcard
//      (T_A (T_A (Tuple Boolean Int) (CC_B Boolean Boolean Boolean Boolean))
//           (CC_B Boolean Boolean Boolean (T_A Boolean Boolean))))