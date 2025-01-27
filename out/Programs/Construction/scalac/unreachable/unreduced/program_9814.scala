package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[(Int,Byte)]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[Int]) extends T_A
case class CC_D(a: T_B[CC_B], b: Boolean) extends T_B[CC_B]
case class CC_E(a: T_B[Byte]) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _), _) => 0 
  case CC_E(_) => 1 
}
}
// This is not matched: CC_D(CC_E(_), _)