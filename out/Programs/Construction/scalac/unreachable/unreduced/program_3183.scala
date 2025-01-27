package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C]) extends T_A[(T_B,T_A[T_B, T_B]), C]
case class CC_B() extends T_B
case class CC_C(a: CC_A[CC_A[CC_B]], b: Byte, c: T_B) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _), _, CC_B()) => 1 
  case CC_C(CC_A(_, _), _, CC_C(_, _, _)) => 2 
  case CC_D() => 3 
}
}
// This is not matched: CC_C(CC_A(_, _), _, CC_D())