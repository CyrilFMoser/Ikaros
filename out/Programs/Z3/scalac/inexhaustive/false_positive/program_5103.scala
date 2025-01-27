package Program_11 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A]) extends T_A
case class CC_B(a: Boolean) extends T_A
case class CC_C[C](a: Char, b: CC_A, c: T_B[CC_A, C]) extends T_B[CC_A, C]
case class CC_D[D, E, F](a: F, b: CC_B) extends T_B[E, D]

val v_a: T_B[CC_A, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(_)) => 0 
  case CC_C('x', _, CC_D(_, _)) => 1 
  case CC_C('x', CC_A(_), CC_C(_, _, _)) => 2 
  case CC_C('x', _, CC_C(_, _, _)) => 3 
  case CC_C(_, _, _) => 4 
}
}
// This is not matched: (CC_D Boolean
//      (CC_A (T_B T_A T_A) (T_B T_A T_A))
//      T_A
//      Wildcard
//      (CC_B Boolean T_A)
//      (T_B (CC_A (T_B T_A T_A) (T_B T_A T_A)) Boolean))
// This is not matched: (CC_B Wildcard T_A)