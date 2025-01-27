package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: (T_B,T_A[T_B, T_B])) extends T_A[T_B, C]
case class CC_B[D](a: CC_A[D], b: T_A[T_B, CC_A[T_A[T_B, (Char,Byte)]]], c: (T_A[T_B, T_B],T_A[T_B, Byte])) extends T_A[T_B, D]
case class CC_C[F]() extends T_A[T_B, F]
case class CC_D(a: T_A[CC_B[T_B], CC_B[T_B]]) extends T_B
case class CC_E(a: T_B, b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(CC_D(_), CC_D(_)) => 0 
  case CC_E(CC_E(CC_D(_), _), CC_D(_)) => 1 
  case CC_E(CC_E(CC_E(_, _), _), CC_D(_)) => 2 
  case CC_E(CC_D(_), CC_E(_, _)) => 3 
  case CC_E(CC_E(CC_D(_), _), CC_E(_, _)) => 4 
  case CC_E(CC_E(CC_E(_, _), _), CC_E(_, _)) => 5 
}
}
// This is not matched: CC_D(_)