package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_B[T_B[T_A]], c: ((Byte,T_A),T_A)) extends T_A
case class CC_B(a: T_B[CC_A]) extends T_B[CC_A]
case class CC_C(a: T_B[Boolean], b: CC_B) extends T_B[CC_A]
case class CC_D() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_, _))) => 1 
  case CC_B(CC_B(CC_D())) => 2 
  case CC_B(CC_C(_, _)) => 3 
  case CC_B(CC_D()) => 4 
  case CC_C(_, CC_B(_)) => 5 
  case CC_D() => 6 
}
}