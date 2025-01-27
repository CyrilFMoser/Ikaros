package Program_30 

package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte) extends T_A[B]
case class CC_B[C](a: C) extends T_A[C]
case class CC_C[D, E](a: D, b: T_A[E], c: E) extends T_A[D]

val v_a: CC_C[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_), _) => 0 
  case CC_C('x', CC_C(_, _, _), _) => 1 
  case CC_C('x', _, _) => 2 
  case CC_C(_, CC_B(_), _) => 3 
  case CC_C(_, CC_C(_, _, _), _) => 4 
  case CC_C('x', CC_A(_), _) => 5 
}
}
// This is not matched: (CC_C Char
//      Boolean
//      Wildcard
//      (CC_C Boolean
//            Boolean
//            Wildcard
//            (CC_A Boolean Byte (T_A Boolean))
//            Wildcard
//            (T_A Boolean))
//      Wildcard
//      (T_A Char))
// This is not matched: (CC_B Wildcard T_A)