package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Char, c: T_A[C, C]) extends T_A[T_A[T_A[Int, Char], T_A[Boolean, Int]], C]
case class CC_B(a: CC_A[(Byte,Char)], b: CC_A[CC_A[Boolean]]) extends T_A[T_A[T_A[Int, Char], T_A[Boolean, Int]], (Int,T_A[Byte, Boolean])]
case class CC_C[D](a: CC_B, b: CC_A[D]) extends T_A[T_A[T_A[Int, Char], T_A[Boolean, Int]], D]

val v_a: T_A[T_A[T_A[Int, Char], T_A[Boolean, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}