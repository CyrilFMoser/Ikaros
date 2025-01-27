package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[Char, T_A[T_A[Boolean, Char], T_A[Int, Boolean]]]
case class CC_B(a: T_A[(CC_A,CC_A), T_A[Byte, Boolean]], b: Char) extends T_A[Char, T_A[T_A[Boolean, Char], T_A[Int, Boolean]]]
case class CC_C(a: T_B[T_B[CC_A]], b: CC_A, c: T_A[(CC_B,CC_B), Byte]) extends T_A[Char, T_A[T_A[Boolean, Char], T_A[Int, Boolean]]]

val v_a: T_A[Char, T_A[T_A[Boolean, Char], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, CC_A(), _) => 1 
}
}
// This is not matched: CC_B(_, _)