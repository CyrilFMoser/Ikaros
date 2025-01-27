package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Int, Byte], b: T_A[T_A[Byte]], c: T_A[T_B[Char, Char]]) extends T_A[T_B[T_A[Char], T_B[Byte, Boolean]]]
case class CC_B[D](a: D, b: Byte) extends T_A[D]
case class CC_C() extends T_A[T_B[T_A[Char], T_B[Byte, Boolean]]]
case class CC_D[E](a: CC_B[E]) extends T_B[Char, E]

val v_a: T_A[T_B[T_A[Char], T_B[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(CC_B(_, _), _), CC_B(CC_D(_), _)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _)