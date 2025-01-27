package Program_31 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_B, b: (T_B,T_B)) extends T_A[C, D]
case class CC_B[E, F](a: T_B, b: T_A[E, F], c: Boolean) extends T_A[E, F]
case class CC_C[G](a: G, b: T_A[G, G]) extends T_B
case class CC_D(a: CC_B[T_B, T_B], b: CC_C[T_B], c: CC_A[Boolean, T_B]) extends T_B
case class CC_E(a: Boolean, b: T_A[CC_D, T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_C(_, CC_A(_, _)) => 1 
  case CC_E(_, CC_B(_, _, _)) => 2 
  case CC_E(_, _) => 3 
  case CC_D(_, CC_C(_, _), _) => 4 
  case CC_D(CC_B(_, _, _), _, _) => 5 
  case CC_D(_, _, _) => 6 
  case CC_D(_, CC_C(_, _), CC_A(_, _)) => 7 
}
}
// This is not matched: (CC_C T_B Wildcard Wildcard T_B)
// This is not matched: (CC_A Boolean
//      (CC_A (Tuple Boolean Byte) Wildcard Wildcard (T_A (Tuple Boolean Byte)))
//      Wildcard
//      (T_A Boolean))