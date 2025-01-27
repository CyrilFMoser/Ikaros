package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B() extends T_A[T_A[Byte, Boolean], T_A[T_A[Byte, Boolean], T_A[Byte, Boolean]]]
case class CC_C[D](a: D, b: D, c: CC_A[D]) extends T_A[D, T_A[D, D]]

val v_a: T_A[T_A[Byte, Boolean], T_A[T_A[Byte, Boolean], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _, CC_A()) => 2 
}
}