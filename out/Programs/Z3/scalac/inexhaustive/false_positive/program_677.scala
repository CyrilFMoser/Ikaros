package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E, F](a: T_A[E], b: CC_A[E]) extends T_A[E]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_B(CC_A(), _) => 2 
  case CC_B(_, CC_A()) => 3 
  case CC_B(CC_B(_, _), _) => 4 
}
}
// This is not matched: (CC_B Boolean
//      Boolean
//      (CC_B Boolean
//            Boolean
//            (CC_A Boolean (T_A Boolean))
//            (CC_A Boolean (T_A Boolean))
//            (T_A Boolean))
//      (CC_A Boolean (T_A Boolean))
//      (T_A Boolean))
// This is not matched: (CC_B Byte Int Wildcard Wildcard Wildcard (T_A Int Byte))