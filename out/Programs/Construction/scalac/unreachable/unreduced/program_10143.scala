package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: Boolean) extends T_A
case class CC_B(a: T_B[(CC_A,CC_A)]) extends T_A
case class CC_C(a: CC_A, b: CC_A) extends T_A
case class CC_D(a: T_A, b: Boolean) extends T_B[Boolean]
case class CC_E(a: T_B[Int]) extends T_B[Boolean]
case class CC_F(a: T_B[CC_D], b: Byte) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), _) => 0 
  case CC_D(CC_B(_), _) => 1 
  case CC_D(CC_C(_, _), _) => 2 
  case CC_E(_) => 3 
  case CC_F(_, 0) => 4 
  case CC_F(_, _) => 5 
}
}