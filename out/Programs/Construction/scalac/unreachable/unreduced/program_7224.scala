package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Int],T_A[Boolean, Byte]), b: T_A[C, C], c: C) extends T_A[T_A[T_A[Int, Byte], T_A[Char, Boolean]], C]
case class CC_B[D](a: Byte, b: CC_A[D]) extends T_A[T_A[T_A[Int, Byte], T_A[Char, Boolean]], D]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Char, Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(_, _) => 1 
}
}