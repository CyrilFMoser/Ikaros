package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean) extends T_A[C, T_B]
case class CC_B(a: T_A[T_A[T_B, Boolean], (T_B,T_B)]) extends T_A[T_A[CC_A[T_B], T_A[(Byte,Byte), T_B]], T_B]
case class CC_C[D](a: T_A[D, T_B], b: T_A[D, T_B]) extends T_A[D, T_B]
case class CC_D[E](a: E, b: CC_B) extends T_B
case class CC_E(a: T_A[CC_B, T_B], b: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(_)) => 0 
  case CC_E(CC_A(_), _) => 1 
  case CC_E(CC_C(CC_A(_), CC_A(_)), _) => 2 
  case CC_E(CC_C(CC_C(_, _), CC_A(_)), _) => 3 
  case CC_E(CC_C(CC_A(_), CC_C(_, _)), _) => 4 
  case CC_E(CC_C(CC_C(_, _), CC_C(_, _)), _) => 5 
}
}