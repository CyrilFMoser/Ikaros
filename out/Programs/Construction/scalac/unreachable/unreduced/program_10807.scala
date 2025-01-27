package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[Byte, T_A[Boolean, Byte]]]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: D) extends T_A[D, T_A[Byte, T_A[Boolean, Byte]]]
case class CC_C[E, F]() extends T_A[E, T_A[Byte, T_A[Boolean, Byte]]]

val v_a: T_A[Boolean, T_A[Byte, T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_C() => 2 
}
}