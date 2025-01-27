package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B[B](a: CC_A) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D(a: T_A) extends T_B[(Int,CC_A)]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _)) => 0 
  case CC_D(CC_B(CC_A(_, _))) => 1 
  case CC_D(CC_C(CC_A(_, _))) => 2 
  case CC_D(CC_C(CC_B(_))) => 3 
  case CC_D(CC_C(CC_C(_))) => 4 
}
}