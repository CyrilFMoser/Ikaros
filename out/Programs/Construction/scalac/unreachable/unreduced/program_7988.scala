package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, C]) extends T_A[C, T_A[Byte, T_A[Boolean, (Char,Int)]]]
case class CC_B[D](a: CC_A[D]) extends T_A[D, T_A[Byte, T_A[Boolean, (Char,Int)]]]
case class CC_C[E](a: E) extends T_A[E, T_A[Byte, T_A[Boolean, (Char,Int)]]]

val v_a: T_A[Boolean, T_A[Byte, T_A[Boolean, (Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}