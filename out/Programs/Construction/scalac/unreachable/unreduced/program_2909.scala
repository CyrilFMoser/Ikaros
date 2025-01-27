package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[Char, C], c: T_A[C, C]) extends T_A[Char, C]
case class CC_B(a: T_A[Char, CC_A[Char]], b: Int, c: CC_A[CC_A[Boolean]]) extends T_A[Char, T_A[CC_A[Byte], T_A[Char, Byte]]]
case class CC_C[D](a: CC_A[D], b: D, c: CC_B) extends T_A[Char, D]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_C(_, _, _), _) => 1 
  case CC_C(_, _, _) => 2 
}
}