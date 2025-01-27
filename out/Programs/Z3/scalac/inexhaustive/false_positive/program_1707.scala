package Program_31 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[Boolean, Char], C]

val v_a: T_A[T_A[Boolean, Char], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A (T_A Boolean Char) Boolean))
// This is not matched: (CC_B (Tuple (CC_C (CC_B Wildcard (CC_A T_A) T_A) T_A) Wildcard)
//      (CC_B (Tuple Wildcard (CC_A T_A)) Wildcard T_A)
//      T_A)