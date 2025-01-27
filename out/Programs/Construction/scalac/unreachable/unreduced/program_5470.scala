package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[(T_B,T_B), T_A[T_B, T_B]]]
case class CC_B[D](a: T_A[D, Boolean], b: CC_A[D], c: (CC_A[T_B],T_A[T_B, T_B])) extends T_A[D, T_A[(T_B,T_B), T_A[T_B, T_B]]]
case class CC_C(a: T_B) extends T_B
case class CC_D(a: CC_B[Boolean]) extends T_B

val v_a: T_A[CC_D, T_A[(T_B,T_B), T_A[T_B, T_B]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}