package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[T_A[Byte, (Byte,Char)], T_A[Byte, Int]], C]
case class CC_B[D](a: D, b: D, c: D) extends T_A[T_A[T_A[Byte, (Byte,Char)], T_A[Byte, Int]], D]

val v_a: T_A[T_A[T_A[Byte, (Byte,Char)], T_A[Byte, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(12, 12, _) => 1 
  case CC_B(12, _, _) => 2 
  case CC_B(_, 12, _) => 3 
  case CC_B(_, _, _) => 4 
}
}