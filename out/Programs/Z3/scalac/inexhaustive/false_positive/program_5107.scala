package Program_14 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[Char], T_A[(Int,Boolean), Byte]]
case class CC_B[D, E](a: T_A[E, D], b: T_B[D]) extends T_A[E, D]
case class CC_C(a: CC_B[CC_A, CC_A]) extends T_A[T_B[Char], T_A[(Int,Boolean), Byte]]
case class CC_D(a: T_A[CC_A, Int]) extends T_B[Boolean]
case class CC_E[F](a: (CC_C,CC_A), b: F, c: Boolean) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, _, _) => 1 
}
}
// This is not matched: (CC_E Boolean Wildcard Wildcard Wildcard (T_B Boolean))
// This is not matched: (CC_A Byte (T_A Byte))