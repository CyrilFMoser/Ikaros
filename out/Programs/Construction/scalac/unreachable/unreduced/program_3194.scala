package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C], c: C) extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B[D](a: Byte) extends T_A[D, T_A[D, T_A[D, D]]]

val v_a: T_A[Char, T_A[Char, T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A('x', _, 'x') => 0 
  case CC_A('x', _, _) => 1 
  case CC_A(_, _, 'x') => 2 
  case CC_A(_, _, _) => 3 
  case CC_B(0) => 4 
  case CC_B(_) => 5 
}
}