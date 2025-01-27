package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Char], (Char,Boolean)], C]
case class CC_B[D](a: CC_A[D], b: Byte, c: Int) extends T_A[T_A[T_A[Boolean, Char], (Char,Boolean)], D]

val v_a: T_A[T_A[T_A[Boolean, Char], (Char,Boolean)], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, 0, _) => 1 
  case CC_B(_, _, _) => 2 
}
}