package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: Byte, c: Boolean) extends T_A[C, (T_A[(Char,Int), Byte],T_A[Byte, Int])]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, (T_A[(Char,Int), Byte],T_A[Byte, Int])]
case class CC_C(a: CC_A[T_A[Boolean, Int]]) extends T_A[T_A[Byte, T_A[Byte, Boolean]], Int]

val v_a: T_A[Boolean, (T_A[(Char,Int), Byte],T_A[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}