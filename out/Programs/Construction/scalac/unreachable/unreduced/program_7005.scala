package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: Byte) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[Int, T_A[Int, Int]], b: T_A[T_A[Char, Int], T_A[T_A[Char, Int], T_A[Char, Int]]]) extends T_A[CC_A[((Int,Boolean),Int)], T_A[CC_A[((Int,Boolean),Int)], CC_A[((Int,Boolean),Int)]]]
case class CC_C(a: CC_A[Char], b: CC_A[(CC_B,(Int,Boolean))], c: T_A[T_A[CC_B, CC_B], T_A[CC_B, CC_B]]) extends T_A[Char, T_A[Char, Char]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), 0) => 0 
  case CC_A(CC_A(CC_C(_, _, _), _), 0) => 1 
  case CC_A(CC_C(CC_A(_, _), _, _), 0) => 2 
  case CC_A(CC_A(CC_A(_, _), _), _) => 3 
  case CC_A(CC_A(CC_C(_, _, _), _), _) => 4 
  case CC_A(CC_C(CC_A(_, _), _, _), _) => 5 
  case CC_C(_, _, _) => 6 
}
}