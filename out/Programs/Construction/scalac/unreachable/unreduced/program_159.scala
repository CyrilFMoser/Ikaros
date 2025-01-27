package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Boolean]], b: T_B[T_B[Boolean]]) extends T_A[Char]
case class CC_B[C]() extends T_A[C]
case class CC_C(a: T_B[T_A[Char]]) extends T_A[Char]
case class CC_D() extends T_B[T_B[T_B[Boolean]]]
case class CC_E(a: CC_C, b: T_B[T_A[CC_D]], c: T_A[T_A[CC_A]]) extends T_B[T_B[T_B[Boolean]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_)