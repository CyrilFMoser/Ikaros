package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Int],Int), b: C, c: T_A[C, C]) extends T_A[C, Byte]
case class CC_B[D](a: Char, b: D) extends T_A[D, Byte]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B('x', _) => 1 
  case CC_B(_, _) => 2 
}
}