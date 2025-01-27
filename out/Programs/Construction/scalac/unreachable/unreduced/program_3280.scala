package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_B[(T_A,Boolean)]) extends T_A
case class CC_C(a: T_A) extends T_B[CC_B]
case class CC_D(a: T_B[T_A]) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_C(CC_B(_, _)) => 1 
  case CC_D(_) => 2 
}
}