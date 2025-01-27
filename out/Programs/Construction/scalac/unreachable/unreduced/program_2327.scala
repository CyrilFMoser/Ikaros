package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Byte, Char], T_A[Boolean]]]
case class CC_B(a: CC_A, b: T_B[T_A[CC_A], (Char,CC_A)]) extends T_A[T_B[T_B[Byte, Char], T_A[Boolean]]]
case class CC_C(a: Char, b: T_A[Byte]) extends T_A[T_B[T_B[Byte, Char], T_A[Boolean]]]

val v_a: T_A[T_B[T_B[Byte, Char], T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_C(_, _) => 2 
}
}