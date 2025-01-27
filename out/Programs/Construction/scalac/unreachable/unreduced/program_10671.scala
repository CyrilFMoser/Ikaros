package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, Boolean]
case class CC_B[D](a: T_A[D, Boolean], b: T_B) extends T_A[D, Boolean]
case class CC_C[E](a: T_A[E, Boolean], b: CC_B[E]) extends T_A[E, Boolean]
case class CC_D(a: Boolean, b: T_B, c: T_A[T_A[T_B, Boolean], Byte]) extends T_B
case class CC_E(a: Byte, b: CC_C[T_A[T_B, Boolean]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(_, _, _), _) => 0 
  case CC_D(_, CC_E(_, CC_C(_, _)), _) => 1 
  case CC_E(_, CC_C(CC_A(_), _)) => 2 
  case CC_E(_, CC_C(CC_B(_, _), _)) => 3 
  case CC_E(_, CC_C(CC_C(_, _), _)) => 4 
}
}