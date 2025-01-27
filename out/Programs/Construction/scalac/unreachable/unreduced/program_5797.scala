package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[Byte, C]) extends T_A[Byte, C]
case class CC_B(a: CC_A[Boolean]) extends T_A[Byte, T_A[Byte, T_A[Char, Int]]]
case class CC_C() extends T_A[Byte, T_A[Byte, T_A[Char, Int]]]

val v_a: T_A[Byte, T_A[Byte, T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(CC_A(_, _))) => 1 
  case CC_A(_, CC_C()) => 2 
  case CC_B(CC_A(_, CC_A(_, _))) => 3 
  case CC_C() => 4 
}
}