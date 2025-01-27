package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Int],T_A[Byte, Byte]), b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[T_A[Int, Byte], T_A[Char, Int]], C]
case class CC_B[D](a: Int) extends T_A[T_A[T_A[Int, Byte], T_A[Char, Int]], D]
case class CC_C[E]() extends T_A[E, T_A[E, E]]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Char, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(_) => 1 
}
}