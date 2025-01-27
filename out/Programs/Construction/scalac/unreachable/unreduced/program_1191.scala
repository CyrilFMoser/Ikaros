package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_A[T_B, T_B],T_B), b: Int) extends T_A[T_B, T_B]
case class CC_B(a: CC_A, b: T_B) extends T_A[T_B, T_B]
case class CC_C[C](a: CC_A) extends T_B
case class CC_D(a: (T_A[CC_A, CC_A],T_A[T_B, T_B])) extends T_B
case class CC_E(a: CC_D, b: T_A[T_A[Byte, CC_A], T_A[CC_A, CC_D]]) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_C(_)) => 0 
  case CC_B(CC_A(_, _), CC_D(_)) => 1 
  case CC_B(CC_A(_, _), CC_E(_, _)) => 2 
}
}