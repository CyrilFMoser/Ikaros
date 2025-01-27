package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[Char, Char], Byte], C]
case class CC_B[D](a: Char, b: CC_A[D], c: CC_A[CC_A[D]]) extends T_A[T_A[T_A[Char, Char], Byte], D]
case class CC_C() extends T_A[T_A[T_A[Char, Char], Byte], CC_A[T_A[Boolean, Char]]]

val v_a: T_A[T_A[T_A[Char, Char], Byte], CC_A[T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, CC_A(_, _), _)