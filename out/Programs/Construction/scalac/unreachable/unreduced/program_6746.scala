package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[Int, (Char,Byte)],T_A[Boolean, (Char,Byte)])) extends T_A[T_A[T_A[Byte, Int], T_A[Char, Int]], C]
case class CC_B[D, E](a: CC_A[D]) extends T_A[T_A[T_A[Byte, Int], T_A[Char, Int]], D]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Char, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_) => 1 
}
}