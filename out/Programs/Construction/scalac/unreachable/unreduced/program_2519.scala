package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: Char, c: Int) extends T_A[T_B]
case class CC_B(a: T_A[Boolean], b: T_B) extends T_A[T_B]
case class CC_C(a: CC_B) extends T_B
case class CC_D(a: T_B, b: CC_B) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}