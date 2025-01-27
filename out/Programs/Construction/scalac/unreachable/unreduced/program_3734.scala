package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Char, Byte], b: T_A[Char, Byte]) extends T_A[Char, Byte]
case class CC_B(a: T_A[Char, Byte], b: T_A[Char, Byte], c: T_A[T_A[Char, Byte], (Int,Byte)]) extends T_A[Char, Byte]
case class CC_C[D](a: (CC_B,CC_A[Byte]), b: Boolean) extends T_A[CC_B, D]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, CC_A(_, _))) => 0 
  case CC_A(CC_B(CC_A(_, _), _, _), CC_A(_, CC_A(_, _))) => 1 
  case CC_A(CC_B(CC_B(_, _, _), _, _), CC_A(_, CC_A(_, _))) => 2 
  case CC_A(CC_A(_, _), CC_A(_, CC_B(_, _, _))) => 3 
  case CC_A(CC_B(CC_A(_, _), _, _), CC_A(_, CC_B(_, _, _))) => 4 
  case CC_A(CC_B(CC_B(_, _, _), _, _), CC_A(_, CC_B(_, _, _))) => 5 
  case CC_A(CC_A(_, _), CC_B(_, _, _)) => 6 
  case CC_A(CC_B(CC_A(_, _), _, _), CC_B(_, _, _)) => 7 
  case CC_A(CC_B(CC_B(_, _, _), _, _), CC_B(_, _, _)) => 8 
}
}