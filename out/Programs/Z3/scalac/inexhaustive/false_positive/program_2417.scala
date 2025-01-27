package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: T_A[E, E], b: (Int,(Char,Int))) extends T_A[E, D]
case class CC_B[G](a: T_B[Char], b: Byte) extends T_A[G, T_A[Int, Char]]
case class CC_C(a: Char, b: Byte) extends T_A[T_B[Int], T_A[Int, Char]]
case class CC_D() extends T_B[Char]
case class CC_E[H](a: T_A[H, H], b: T_A[H, H]) extends T_B[H]

val v_a: CC_E[T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_E (T_B Char)
//      (CC_A (T_B Char)
//            (T_B Char)
//            Boolean
//            Wildcard
//            Wildcard
//            (T_A (T_B Char) (T_B Char)))
//      Wildcard
//      (T_B (T_B Char)))
// This is not matched: (CC_B Wildcard T_A)