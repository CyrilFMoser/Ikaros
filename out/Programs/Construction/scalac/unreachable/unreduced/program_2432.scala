package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_B[Char, Int]]]
case class CC_B(a: T_A[CC_A], b: T_A[T_A[CC_A]], c: T_B[Byte, CC_A]) extends T_A[T_A[T_B[Char, Int]]]
case class CC_C() extends T_A[T_A[T_B[Char, Int]]]
case class CC_D(a: CC_A, b: Int, c: CC_C) extends T_B[CC_C, T_B[(Byte,CC_C), CC_C]]
case class CC_E() extends T_B[CC_C, T_B[(Byte,CC_C), CC_C]]
case class CC_F[D](a: Byte, b: T_B[Int, D]) extends T_B[(Char,CC_D), D]

val v_a: T_A[T_A[T_B[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}