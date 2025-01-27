package Program_63 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_C() extends T_A[T_B]
case class CC_D() extends T_B
case class CC_E(a: Int, b: T_A[Boolean], c: T_B) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(_, _, CC_E(_, _, _)) => 0 
}
}
// This is not matched: CC_A()