package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: T_A[Boolean]) extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]
case class CC_C(a: CC_A, b: T_A[CC_B], c: T_A[CC_A]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)