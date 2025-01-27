package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: T_A[T_B[D], D]) extends T_A[D, E]
case class CC_B() extends T_B[CC_A[Char, Boolean, T_A[Byte, Byte]]]
case class CC_C(a: T_B[Int], b: T_A[T_A[Byte, CC_B], T_A[CC_B, CC_B]], c: Byte) extends T_B[CC_A[Char, Boolean, T_A[Byte, Byte]]]

val v_a: T_B[CC_A[Char, Boolean, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A(CC_A(_)), _) => 1 
}
}