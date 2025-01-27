package Program_15 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Char]) extends T_A[T_B[Char]]
case class CC_B[C](a: (CC_A,(Boolean,Int)), b: T_B[C]) extends T_A[T_B[Char]]
case class CC_C(a: CC_B[CC_A]) extends T_B[Boolean]
case class CC_D(a: T_B[Boolean], b: T_A[CC_C], c: T_B[Boolean]) extends T_B[Boolean]
case class CC_E(a: CC_D, b: CC_B[Boolean]) extends T_B[Boolean]

val v_a: T_A[T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_D(_, _, _)) => 1 
  case CC_B((CC_A(_),(_,_)), CC_C(_)) => 2 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_A (T_B Char)))
// This is not matched: (CC_D (Tuple Byte T_A)
//      (CC_C (CC_A T_A) Wildcard (T_B (CC_A Wildcard) (Tuple Byte T_A)))
//      (T_B (CC_A T_A) (Tuple Byte T_A)))