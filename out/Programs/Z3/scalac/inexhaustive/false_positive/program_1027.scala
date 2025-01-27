package Program_30 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: C, b: T_A[E, C]) extends T_A[C, D]
case class CC_B[F](a: T_A[F, F], b: F, c: T_A[F, F]) extends T_A[(Int,Char), F]
case class CC_C[G]() extends T_A[(Int,Char), G]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, _) => 0 
}
}
// This is not matched: (CC_B Char
//      (CC_A Char
//            Char
//            (Tuple Int Char)
//            Wildcard
//            (CC_C Char (T_A (Tuple Int Char) Char))
//            (T_A Char Char))
//      Wildcard
//      Wildcard
//      (T_A (Tuple Int Char) Char))
// This is not matched: (CC_B Char
//      (CC_A Char
//            Char
//            (Tuple Int Char)
//            Wildcard
//            (CC_C Char (T_A (Tuple Int Char) Char))
//            (T_A Char Char))
//      Wildcard
//      Wildcard
//      (T_A (Tuple Int Char) Char))