package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[T_A[Char, Char], Byte], C]
case class CC_B[D](a: Byte, b: CC_A[D]) extends T_A[T_A[T_A[Char, Char], Byte], CC_A[CC_A[Char]]]

val v_a: T_A[T_A[T_A[Char, Char], Byte], CC_A[CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_B(_, _) => 1 
}
}