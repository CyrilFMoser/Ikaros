package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Char, C], b: T_A[(Boolean,Int), C], c: Byte) extends T_A[Char, C]
case class CC_B[D](a: T_A[Char, D], b: T_A[Char, D]) extends T_A[Char, D]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_B(_, _), _, _), _, _) => 1 
  case CC_A(CC_B(CC_A(_, _, _), CC_A(_, _, _)), _, _) => 2 
  case CC_A(CC_B(CC_A(_, _, _), CC_B(_, _)), _, _) => 3 
  case CC_A(CC_B(CC_B(_, _), CC_A(_, _, _)), _, _) => 4 
  case CC_A(CC_B(CC_B(_, _), CC_B(_, _)), _, _) => 5 
  case CC_B(_, _) => 6 
}
}