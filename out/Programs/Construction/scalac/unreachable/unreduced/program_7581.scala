package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B(a: CC_A[CC_A[T_B]], b: T_A[Int, Char], c: Byte) extends T_B
case class CC_C(a: T_A[T_A[T_A[CC_B, Byte], T_A[CC_B, Byte]], T_A[CC_B, Byte]]) extends T_B
case class CC_D(a: T_A[CC_A[T_B], CC_C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_)), _, _) => 0 
  case CC_C(CC_A(CC_A(_))) => 1 
  case CC_D(_) => 2 
}
}