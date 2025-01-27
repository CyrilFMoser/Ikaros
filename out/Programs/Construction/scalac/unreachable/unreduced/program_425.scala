package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int) extends T_A
case class CC_B(a: T_B[CC_A]) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D(a: T_B[T_B[Char]]) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_D(_)) => 1 
  case CC_C(CC_B(_)) => 2 
}
}