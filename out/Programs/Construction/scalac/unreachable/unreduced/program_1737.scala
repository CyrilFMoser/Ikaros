package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], (T_A,(Boolean,Char))]) extends T_A
case class CC_B(a: Char) extends T_A
case class CC_C(a: Int) extends T_B[CC_B, CC_B]
case class CC_D(a: T_A) extends T_B[CC_B, CC_B]
case class CC_E(a: CC_A, b: T_A) extends T_B[CC_B, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}