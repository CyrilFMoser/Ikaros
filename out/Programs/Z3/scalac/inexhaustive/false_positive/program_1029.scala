package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: C, b: T_A[E, C]) extends T_A[C, D]
case class CC_B[F](a: T_A[F, F], b: F, c: T_A[F, F]) extends T_A[(Int,Char), F]
case class CC_C[G]() extends T_A[(Int,Char), G]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), 'x', _) => 0 
  case CC_B(_, _, CC_A(_, _)) => 1 
  case CC_B(CC_A(_, _), _, CC_A(_, _)) => 2 
  case CC_B(_, 'x', CC_A(_, _)) => 3 
  case CC_B(_, 'x', _) => 4 
}
}
// This is not matched: (CC_B Char
//      Wildcard
//      Wildcard
//      (CC_A Char
//            Char
//            Boolean
//            Wildcard
//            (CC_A Boolean
//                  Char
//                  (Tuple Int Char)
//                  Wildcard
//                  (CC_C Boolean (T_A (Tuple Int Char) Boolean))
//                  (T_A Boolean Char))
//            (T_A Char Char))
//      (T_A (Tuple Int Char) Char))
// This is not matched: (CC_F Wildcard Wildcard T_B)