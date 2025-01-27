package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[B]() extends T_B[CC_A]
case class CC_E(a: T_B[CC_D[(Boolean,Byte)]]) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}