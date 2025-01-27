package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, Boolean], b: T_A[C, C]) extends T_A[C, Boolean]
case class CC_B[D](a: D) extends T_A[D, T_A[T_A[T_B, Char], T_B]]
case class CC_C(a: CC_A[CC_B[T_B]], b: T_B, c: T_A[Byte, Boolean]) extends T_B
case class CC_D() extends T_B
case class CC_E(a: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_, _), _), CC_C(_, _, _), CC_A(CC_A(_, _), _)) => 0 
  case CC_C(CC_A(CC_A(_, _), _), CC_D(), CC_A(CC_A(_, _), _)) => 1 
  case CC_C(CC_A(CC_A(_, _), _), CC_E(CC_C(_, _, _)), CC_A(CC_A(_, _), _)) => 2 
  case CC_E(_) => 3 
}
}
// This is not matched: CC_D()