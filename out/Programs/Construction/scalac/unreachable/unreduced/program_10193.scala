package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: (T_A[(Char,Boolean)],T_A[Boolean]), b: T_B[T_A[Boolean]]) extends T_A[Boolean]
case class CC_C[C]() extends T_B[C]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A()), _) => 1 
}
}
// This is not matched: CC_B((_,CC_B(_, _)), _)