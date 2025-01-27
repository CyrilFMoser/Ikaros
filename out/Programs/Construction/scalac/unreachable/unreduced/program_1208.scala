package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B) extends T_A[T_A[T_B, Boolean], C]
case class CC_B[D](a: D, b: T_A[T_A[T_B, Boolean], D], c: Boolean) extends T_A[T_A[T_B, Boolean], D]
case class CC_C(a: T_B, b: T_A[T_A[T_B, Boolean], CC_B[(Boolean,Boolean)]], c: CC_B[CC_A[T_B]]) extends T_B
case class CC_D(a: CC_B[CC_C], b: T_A[T_A[T_B, Boolean], CC_B[T_B]], c: CC_B[CC_C]) extends T_B
case class CC_E(a: Byte) extends T_B

val v_a: T_A[T_A[T_B, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _, _)) => 0 
  case CC_A(_, CC_D(_, _, _)) => 1 
  case CC_A(_, CC_E(_)) => 2 
  case CC_B(true, CC_A(_, _), _) => 3 
  case CC_B(true, CC_B(_, _, _), _) => 4 
  case CC_B(false, CC_A(_, _), _) => 5 
  case CC_B(false, CC_B(_, _, _), _) => 6 
}
}