package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Boolean, b: T_A[C]) extends T_A[C]
case class CC_B(a: Boolean, b: CC_A[T_A[Boolean]], c: T_B[T_A[Boolean]]) extends T_B[T_B[Byte]]
case class CC_C(a: T_B[T_B[Byte]], b: T_A[T_A[CC_B]], c: Boolean) extends T_B[T_B[Byte]]

val v_a: T_B[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_C(CC_B(_, _, _), CC_A(_, _), _), CC_A(_, CC_A(_, _)), _) => 1 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), _), CC_A(_, CC_A(_, _)), _) => 2 
}
}
// This is not matched: CC_C(CC_B(_, CC_A(_, _), _), CC_A(_, CC_A(_, _)), _)