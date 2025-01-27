package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A], b: T_B[CC_A]) extends T_A
case class CC_C(a: T_B[Int]) extends T_A
case class CC_D(a: T_B[Int]) extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_D(_)) => 2 
}
}