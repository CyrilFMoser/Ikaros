package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Char, b: T_B[E]) extends T_A[D, E]
case class CC_B(a: T_A[T_A[(Int,Byte), Boolean], CC_A[Int, Boolean]], b: Byte) extends T_B[T_B[T_A[Char, Int]]]
case class CC_C(a: T_A[(CC_B,CC_B), T_A[CC_B, CC_B]], b: T_A[Byte, T_B[Int]]) extends T_B[T_B[T_A[Char, Int]]]
case class CC_D(a: CC_A[T_A[CC_B, CC_B], CC_A[Int, CC_C]], b: CC_C) extends T_B[T_B[T_A[Char, Int]]]

val v_a: T_B[T_B[T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A('x', _), _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_C(_, _) => 2 
  case CC_D(_, CC_C(_, _)) => 3 
}
}