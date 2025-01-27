package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Char, c: C) extends T_A[(Char,Char), C]
case class CC_B[D](a: T_A[(Char,Char), D]) extends T_A[(Char,Char), D]

val v_a: T_A[(Char,Char), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_B(CC_B(CC_A(_, _, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
}
}