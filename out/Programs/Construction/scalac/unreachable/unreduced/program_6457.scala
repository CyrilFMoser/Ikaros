package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Byte], b: C, c: T_A[C, Byte]) extends T_A[C, Byte]
case class CC_B(a: T_A[T_A[Int, Byte], Byte], b: CC_A[T_A[(Boolean,Int), Byte]]) extends T_A[T_A[T_A[Boolean, Char], Byte], Byte]

val v_a: T_A[T_A[T_A[Boolean, Char], Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(CC_A(CC_A(_, _, _), _, _), CC_A(_, _, _), CC_B(_, _)) => 1 
  case CC_A(CC_A(CC_B(_, _), _, _), CC_A(_, _, _), CC_A(_, _, _)) => 2 
  case CC_A(CC_A(CC_B(_, _), _, _), CC_A(_, _, _), CC_B(_, _)) => 3 
  case CC_A(CC_B(CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _), CC_A(_, _, _)) => 4 
  case CC_A(CC_B(CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _), CC_B(_, _)) => 5 
  case CC_B(_, _) => 6 
}
}