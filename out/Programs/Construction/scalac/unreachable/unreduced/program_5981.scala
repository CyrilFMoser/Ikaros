package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: ((T_A,(Boolean,Char)),CC_A), b: CC_B, c: CC_C) extends T_B[(T_A,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_C() => 2 
}
}