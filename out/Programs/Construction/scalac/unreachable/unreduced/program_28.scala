package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: Boolean, c: Boolean) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B() extends T_B
case class CC_C(a: CC_A[T_A[CC_B, CC_B]], b: T_A[T_B, CC_A[T_B]], c: CC_A[CC_B]) extends T_B
case class CC_D(a: CC_A[Byte], b: CC_A[Boolean], c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _, _), _, CC_A(_, _, _)) => 1 
  case CC_D(CC_A(_, _, _), CC_A(_, _, _), CC_C(_, _, _)) => 2 
  case CC_D(CC_A(_, _, _), CC_A(_, _, _), CC_D(_, _, _)) => 3 
}
}
// This is not matched: CC_D(CC_A(_, _, _), CC_A(_, _, _), CC_B())