package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Byte]
case class CC_B(a: Char, b: T_B[T_A[Char]]) extends T_A[Byte]
case class CC_C(a: CC_A, b: T_A[Byte]) extends T_B[T_B[T_A[Byte]]]
case class CC_D(a: CC_B) extends T_B[T_B[T_A[Byte]]]
case class CC_E() extends T_B[T_B[T_A[Byte]]]

val v_a: T_B[T_B[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_A()) => 0 
  case CC_C(CC_A(), CC_B('x', _)) => 1 
  case CC_C(CC_A(), CC_B(_, _)) => 2 
  case CC_D(CC_B(_, _)) => 3 
}
}
// This is not matched: CC_E()