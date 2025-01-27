package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[Byte, T_A[Byte, Byte]]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[D, T_A[Byte, T_A[Byte, Byte]]]

val v_a: T_A[Boolean, T_A[Byte, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}