package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[T_A]) extends T_A
case class CC_B(a: (T_A,CC_A)) extends T_A
case class CC_C() extends T_B[CC_A]
case class CC_D(a: T_B[CC_A], b: T_A) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C(), CC_A(_, _)) => 1 
  case CC_D(CC_C(), CC_B(_)) => 2 
  case CC_D(CC_D(_, _), CC_A(_, _)) => 3 
  case CC_D(CC_D(_, _), CC_B(_)) => 4 
}
}