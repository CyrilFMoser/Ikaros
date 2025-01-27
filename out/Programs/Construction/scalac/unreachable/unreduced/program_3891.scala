package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char, b: Boolean) extends T_A[T_A[T_B]]
case class CC_B(a: CC_A, b: T_A[CC_A]) extends T_B
case class CC_C(a: T_B) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_C(_) => 1 
  case CC_D() => 2 
}
}