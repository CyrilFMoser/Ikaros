package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_B[T_B[Boolean, CC_A], T_A[CC_A]], b: CC_A) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: T_A[(Int,CC_A)], b: Char) extends T_A[T_A[T_A[Boolean]]]
case class CC_D[D]() extends T_B[D, T_B[D, D]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A()