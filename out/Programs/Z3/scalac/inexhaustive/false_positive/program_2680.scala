package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[(Char,Boolean), C]
case class CC_B[D, E, F](a: Boolean, b: T_A[F, D]) extends T_A[E, D]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
}
}
// This is not matched: (CC_B Char
//      Byte
//      (Tuple Char Boolean)
//      Wildcard
//      (CC_A Char Wildcard (T_A (Tuple Char Boolean) Char))
//      (T_A Byte Char))
// This is not matched: (CC_B T_A)