package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_B[T_B[Char]]]
case class CC_B(a: Char, b: T_A[Byte]) extends T_A[T_B[T_B[Char]]]
case class CC_C() extends T_A[T_B[T_B[Char]]]
case class CC_D[C](a: C, b: C) extends T_B[C]
case class CC_E[D](a: CC_C, b: CC_B) extends T_B[D]

val v_a: T_A[T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _)