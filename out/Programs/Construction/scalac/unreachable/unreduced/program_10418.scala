package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte) extends T_A[C, T_A[Byte, T_A[Boolean, Byte]]]
case class CC_B[E](a: T_A[E, E], b: E) extends T_A[E, T_A[Byte, T_A[Boolean, Byte]]]
case class CC_C() extends T_A[Char, T_A[Byte, T_A[Boolean, Byte]]]

val v_a: T_A[Char, T_A[Byte, T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}