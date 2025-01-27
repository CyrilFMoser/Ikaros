package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_B) extends T_A[((T_B,T_B),T_B)]
case class CC_B(a: CC_A, b: T_A[CC_A], c: T_A[T_A[CC_A]]) extends T_B
case class CC_C(a: CC_A) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _)) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_B(_, _, _)