package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]
case class CC_C() extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()