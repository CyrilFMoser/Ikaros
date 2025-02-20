package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[T_A],T_B[Int]), b: (Int,(T_A,T_A)), c: T_B[Int]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: CC_B, c: T_B[T_A]) extends T_B[CC_B]
case class CC_D() extends T_B[CC_B]
case class CC_E(a: CC_B, b: Int) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}