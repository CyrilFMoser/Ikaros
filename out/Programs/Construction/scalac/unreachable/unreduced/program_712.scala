package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D, c: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C(a: T_A[T_A[Byte]], b: T_A[(Byte,Char)], c: Byte) extends T_B[T_A[T_A[(Byte,Char)]], T_A[CC_B[Char]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), 'x', _) => 0 
  case CC_A(CC_B(), 'x', _) => 1 
  case CC_A(CC_A(_, _, _), _, _) => 2 
  case CC_A(CC_B(), _, _) => 3 
  case CC_B() => 4 
}
}