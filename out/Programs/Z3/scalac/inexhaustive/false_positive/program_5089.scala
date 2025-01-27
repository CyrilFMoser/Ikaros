package Program_13 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D]() extends T_A[C]
case class CC_B[E](a: CC_A[E, E], b: Int, c: CC_A[E, E]) extends T_A[E]
case class CC_C[F](a: CC_A[F, F]) extends T_B[F]
case class CC_D[G](a: G, b: CC_C[G], c: T_B[G]) extends T_B[G]
case class CC_E[H](a: Int) extends T_B[H]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(_), CC_C(_)) => 0 
  case CC_D('x', _, CC_E(_)) => 1 
  case CC_D(_, CC_C(_), CC_E(_)) => 2 
}
}
// This is not matched: (CC_D Char
//      Wildcard
//      Wildcard
//      (CC_D Char
//            Char
//            (CC_C Char Wildcard (T_B Char))
//            (CC_D Char Char Wildcard Wildcard (T_B Char))
//            (T_B Char))
//      (T_B Char))
// This is not matched: Pattern match is empty without constants