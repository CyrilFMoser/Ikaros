package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: C, c: T_B) extends T_A[C, T_B]
case class CC_B(a: CC_A[T_A[T_B, T_B]], b: T_A[T_A[T_B, T_B], Byte], c: (T_A[(Int,Byte), T_B],T_B)) extends T_B
case class CC_C(a: (CC_A[CC_B],(CC_B,CC_B)), b: CC_A[T_B]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _, (CC_A(_, _, _),CC_B(_, _, _))) => 0 
  case CC_B(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _, (CC_A(_, _, _),CC_D())) => 1 
  case CC_C(_, CC_A(_, _, _)) => 2 
  case CC_D() => 3 
}
}
// This is not matched: CC_B(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _, (CC_A(_, _, _),CC_C(_, _)))