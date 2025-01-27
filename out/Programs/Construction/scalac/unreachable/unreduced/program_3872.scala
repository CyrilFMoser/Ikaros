package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Char, c: T_A[D, D]) extends T_A[D, T_A[T_B[Int], T_B[Byte]]]
case class CC_B(a: CC_A[CC_A[Int]], b: T_B[T_B[Byte]], c: Byte) extends T_B[Byte]
case class CC_C(a: CC_A[T_B[(Byte,Char)]], b: T_B[Int]) extends T_B[Byte]
case class CC_D() extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _, _), 'x', _), _, 0) => 0 
  case CC_B(CC_A(CC_A(_, _, _), _, _), _, 0) => 1 
  case CC_B(CC_A(CC_A(_, _, _), 'x', _), _, _) => 2 
  case CC_B(CC_A(CC_A(_, _, _), _, _), _, _) => 3 
  case CC_C(_, _) => 4 
  case CC_D() => 5 
}
}