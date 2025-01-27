package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_B]
case class CC_B(a: CC_A[T_A[Int, (Int,Char)]], b: CC_A[CC_A[T_B]]) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _) => 0 
  case CC_C() => 1 
}
}