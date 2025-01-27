package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, T_B], c: T_A[C, C]) extends T_A[C, T_B]
case class CC_B(a: CC_A[Boolean]) extends T_B
case class CC_C(a: T_B, b: (CC_A[T_B],Byte)) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_B(_), CC_A(_, _, _), _)) => 0 
  case CC_B(CC_A(CC_D(), CC_A(_, _, _), _)) => 1 
  case CC_C(_, _) => 2 
  case CC_D() => 3 
}
}
// This is not matched: CC_B(CC_A(CC_C(_, _), CC_A(_, _, _), _))