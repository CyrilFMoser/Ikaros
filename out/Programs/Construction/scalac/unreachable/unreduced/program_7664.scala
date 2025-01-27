package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Byte, C], C], b: T_A[T_A[Boolean, Boolean], C]) extends T_A[C, (T_A[Boolean, Char],Byte)]
case class CC_B[D](a: CC_A[D], b: Int) extends T_A[D, (T_A[Boolean, Char],Byte)]

val v_a: T_A[Int, (T_A[Boolean, Char],Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}