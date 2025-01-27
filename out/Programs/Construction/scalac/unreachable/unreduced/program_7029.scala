package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: T_A[T_B[Char, Char]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_B[T_A[Char], T_A[Char]], b: CC_A, c: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Char]]]
case class CC_C() extends T_A[T_A[T_A[Char]]]
case class CC_D[D](a: T_B[CC_C, D], b: D) extends T_B[CC_C, D]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _)