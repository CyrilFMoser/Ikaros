package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: (T_A[Int, Byte],CC_A[Int]), b: CC_A[D], c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A()), CC_A(), CC_A()) => 1 
  case CC_B((_,CC_A()), CC_A(), CC_B(_, _, CC_A())) => 2 
  case CC_B((_,CC_A()), CC_A(), CC_B(_, _, CC_B(_, _, _))) => 3 
}
}