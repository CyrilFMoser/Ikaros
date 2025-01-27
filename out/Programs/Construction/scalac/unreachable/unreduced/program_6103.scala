package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Boolean, T_B]) extends T_A[T_A[Int, T_A[T_B, Int]], Char]
case class CC_B(a: Char, b: Int, c: T_A[Boolean, CC_A]) extends T_A[T_A[Int, T_A[T_B, Int]], Char]
case class CC_C(a: T_A[T_B, CC_B]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D() => 1 
}
}