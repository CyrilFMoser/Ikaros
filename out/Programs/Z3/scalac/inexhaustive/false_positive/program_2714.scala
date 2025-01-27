package Program_31 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte, b: D, c: T_A[D, D]) extends T_A[D, Int]
case class CC_B[E]() extends T_A[E, Int]
case class CC_C[F, G, H](a: Char, b: CC_B[F]) extends T_A[F, G]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C(_, _)) => 0 
  case CC_A(0, 'x', CC_C(_, _)) => 1 
  case CC_A(_, 'x', CC_C(_, _)) => 2 
}
}
// This is not matched: (CC_A Char
//      Wildcard
//      Wildcard
//      (CC_C Char
//            Char
//            Boolean
//            Wildcard
//            (CC_B Char (T_A Char Int))
//            (T_A Char Char))
//      (T_A Char Int))
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A (T_B Byte (Tuple Byte Char))))