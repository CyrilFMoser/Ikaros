package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean, b: T_A[Boolean], c: T_A[T_A[Char]]) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[T_A[T_B]], b: T_A[CC_A]) extends T_B
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _) => 0 
  case CC_C() => 1 
  case CC_D() => 2 
}
}