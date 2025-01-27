package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Char]]) extends T_A[T_B[T_B[Char]]]
case class CC_B(a: T_A[CC_A], b: T_A[T_B[CC_A]]) extends T_B[T_A[CC_A]]
case class CC_C[C]() extends T_B[C]
case class CC_D() extends T_B[T_B[T_A[CC_A]]]

val v_a: T_B[T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}