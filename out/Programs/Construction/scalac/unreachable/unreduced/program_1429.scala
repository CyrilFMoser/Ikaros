package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: Boolean, b: B, c: (T_A,T_B[T_A])) extends T_A
case class CC_B(a: CC_A[Byte], b: T_B[T_B[Int]]) extends T_A
case class CC_C(a: CC_A[T_B[(Int,Boolean)]], b: T_B[T_B[T_A]], c: Int) extends T_B[((CC_B,T_A),CC_B)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(true, _, _) => 0 
  case CC_A(false, _, _) => 1 
  case CC_B(_, _) => 2 
}
}