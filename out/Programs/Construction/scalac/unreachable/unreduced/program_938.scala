package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_A[T_B]], c: T_A[T_B]) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: CC_B, b: T_A[T_A[T_B]], c: T_A[CC_A]) extends T_B
case class CC_D(a: CC_B, b: (Int,CC_A), c: Char) extends T_B
case class CC_E(a: T_B, b: T_A[CC_A]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}