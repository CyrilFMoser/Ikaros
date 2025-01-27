package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: Byte, c: T_A[C]) extends T_A[T_A[T_B[Byte]]]
case class CC_B(a: T_B[T_B[Int]], b: T_A[CC_A[Char]], c: T_B[T_A[Boolean]]) extends T_A[T_A[T_B[Byte]]]
case class CC_C() extends T_A[T_A[T_B[Byte]]]
case class CC_D(a: CC_B, b: T_A[CC_B], c: CC_B) extends T_B[T_B[CC_C]]

val v_a: T_A[T_A[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}