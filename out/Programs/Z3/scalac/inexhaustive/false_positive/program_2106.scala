package Program_31 

package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: Char, b: D, c: T_A[E, E]) extends T_A[D, C]

val v_a: CC_A[Boolean, Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, 12, _) => 1 
}
}
// This is not matched: (CC_A Boolean
//      Int
//      Char
//      Wildcard
//      Wildcard
//      (CC_A Char
//            Char
//            Boolean
//            Wildcard
//            Wildcard
//            (CC_A Boolean
//                  Boolean
//                  Boolean
//                  Char
//                  Boolean
//                  Wildcard
//                  (T_A Boolean Boolean))
//            (T_A Char Char))
//      (T_A Int Boolean))
// This is not matched: Pattern match is empty without constants