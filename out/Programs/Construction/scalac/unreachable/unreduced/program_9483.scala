package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_B[T_A[Char]], b: T_A[T_A[Boolean]]) extends T_B[T_B[T_A[Boolean]]]
case class CC_C(a: T_A[T_B[CC_B]]) extends T_B[T_B[T_A[Boolean]]]
case class CC_D(a: T_A[T_A[Char]], b: T_B[Char], c: T_A[CC_C]) extends T_B[T_B[T_A[Boolean]]]

val v_a: T_B[T_B[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_A(), _, _) => 1 
}
}
// This is not matched: CC_B(_, CC_A())