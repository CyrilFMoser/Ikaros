package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Byte], T_A[Byte, Char]]) extends T_A[Byte, T_A[Int, T_A[Char, Char]]]
case class CC_B(a: (CC_A,T_A[Char, CC_A]), b: Char) extends T_A[Byte, T_A[Int, T_A[Char, Char]]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[Byte, T_A[Int, T_A[Char, Char]]]

val v_a: T_A[Byte, T_A[Int, T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, 'x') => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_B(_, _)