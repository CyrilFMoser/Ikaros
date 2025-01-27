package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B[D](a: CC_A[D], b: CC_A[D], c: T_A[D, D]) extends T_A[D, T_A[D, T_A[D, D]]]

val v_a: T_A[Byte, T_A[Byte, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
}
}