package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Char]]]
case class CC_B[B](a: Boolean, b: T_A[B], c: CC_A) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_A, b: CC_A, c: T_A[Char]) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, CC_A(_, _), _) => 1 
}
}
// This is not matched: CC_A(_, _)