package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int, b: Char) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A, b: ((CC_A,CC_A),CC_A), c: Byte) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: T_A[Int], b: (Boolean,CC_B)) extends T_A[T_A[T_A[Byte]]]
case class CC_D(a: T_B[CC_B, T_A[Char]], b: T_A[CC_B]) extends T_B[CC_C, T_B[CC_A, T_B[(Char,Char), CC_C]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_, (_,CC_B(_, _, _))) => 3 
}
}