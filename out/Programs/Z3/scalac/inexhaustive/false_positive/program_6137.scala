package Program_15 

package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_B]
case class CC_B[D](a: Boolean) extends T_A[D, T_B]
case class CC_C[E]() extends T_A[E, T_B]
case class CC_D[F](a: T_A[F, T_B]) extends T_B
case class CC_E(a: T_A[Int, T_B], b: CC_D[Int], c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_D(CC_A(_)) => 1 
  case CC_E(CC_A(_), CC_D(_), CC_E(_, _, _)) => 2 
  case CC_E(_, _, _) => 3 
  case CC_E(CC_B(_), CC_D(_), CC_D(_)) => 4 
  case CC_E(CC_C(), CC_D(_), _) => 5 
  case CC_E(CC_B(_), CC_D(_), _) => 6 
}
}
// This is not matched: (CC_D T_B Wildcard T_B)
// This is not matched: Pattern match is empty without constants