package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: T_B[T_B[(Int,Boolean)]], c: CC_B) extends T_A
case class CC_D(a: T_A, b: CC_B) extends T_B[T_B[CC_C]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _, CC_B()) => 1 
}
}
// This is not matched: CC_A(_)