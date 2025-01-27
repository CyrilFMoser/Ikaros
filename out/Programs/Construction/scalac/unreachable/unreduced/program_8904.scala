package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Byte, b: Byte) extends T_A[T_A[T_B, Boolean], C]
case class CC_B[D](a: D, b: T_B, c: Byte) extends T_A[T_A[T_B, Boolean], D]
case class CC_C(a: (CC_B[Byte],(T_B,T_B)), b: T_A[T_B, T_A[T_B, T_B]], c: T_A[T_A[T_B, Boolean], T_B]) extends T_A[T_A[T_B, Boolean], Char]
case class CC_D(a: T_A[T_A[T_B, Boolean], Char], b: T_A[T_A[T_B, Boolean], Int], c: T_A[T_A[T_B, Boolean], Char]) extends T_B
case class CC_E(a: CC_B[CC_B[CC_C]]) extends T_B

val v_a: T_A[T_A[T_B, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_D(CC_A(_, _), CC_A(_, _), _), _) => 1 
  case CC_B(_, CC_D(CC_A(_, _), CC_B(_, _, _), _), _) => 2 
  case CC_B(_, CC_D(CC_B(_, _, _), CC_A(_, _), _), _) => 3 
  case CC_B(_, CC_D(CC_B(_, _, _), CC_B(_, _, _), _), _) => 4 
  case CC_B(_, CC_D(CC_C(_, _, _), CC_A(_, _), _), _) => 5 
  case CC_B(_, CC_D(CC_C(_, _, _), CC_B(_, _, _), _), _) => 6 
  case CC_B(_, CC_E(CC_B(_, _, _)), _) => 7 
}
}