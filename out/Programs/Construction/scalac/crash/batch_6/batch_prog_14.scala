package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[T_A[Char, Char], T_A[Byte, Char]]]

val v_a: T_A[Char, T_A[T_A[Char, Char], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}