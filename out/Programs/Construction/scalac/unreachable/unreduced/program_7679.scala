package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: T_B[CC_A[Byte]], b: Byte) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_B, b: Int) extends T_A[T_A[T_A[Byte]]]
case class CC_D() extends T_B[CC_A[((Byte,Int),CC_C)]]
case class CC_E[D](a: D, b: CC_C) extends T_B[CC_A[((Byte,Int),CC_C)]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B(_, _)) => 3 
  case CC_A(CC_C(CC_B(_, _), 12)) => 4 
  case CC_A(CC_C(CC_B(_, _), _)) => 5 
  case CC_B(_, _) => 6 
  case CC_C(_, 12) => 7 
  case CC_C(_, _) => 8 
}
}