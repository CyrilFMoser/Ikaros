package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[T_B[Boolean, T_A[Byte]]]
case class CC_B(a: T_B[T_B[Int, Char], Byte], b: T_B[CC_A[Boolean], Byte], c: T_A[Int]) extends T_A[T_B[Boolean, T_A[Byte]]]
case class CC_C(a: CC_B, b: T_A[CC_A[Byte]]) extends T_A[T_B[Boolean, T_A[Byte]]]
case class CC_D[E](a: (T_B[CC_C, CC_C],T_B[CC_B, CC_B]), b: E, c: T_B[CC_C, E]) extends T_B[E, T_A[E]]
case class CC_E(a: CC_D[CC_D[CC_B]], b: T_A[CC_B], c: T_A[T_A[CC_B]]) extends T_B[T_B[T_A[Char], CC_A[CC_C]], T_A[T_B[T_A[Char], CC_A[CC_C]]]]
case class CC_F(a: T_B[(CC_E,CC_B), T_A[(CC_E,CC_B)]], b: Int) extends T_B[T_B[T_A[Char], CC_A[CC_C]], T_A[T_B[T_A[Char], CC_A[CC_C]]]]

val v_a: T_A[T_B[Boolean, T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(CC_B(_, _, _), _)