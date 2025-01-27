package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_B[(Boolean,Int)]]) extends T_A
case class CC_B(a: Int, b: T_A, c: Char) extends T_A
case class CC_C[B](a: T_A, b: CC_B) extends T_A
case class CC_D(a: CC_B) extends T_B[T_B[(Boolean,Boolean)]]

val v_a: T_B[T_B[(Boolean,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, CC_A(_, _), _)) => 0 
  case CC_D(CC_B(_, CC_B(_, _, _), _)) => 1 
}
}
// This is not matched: CC_D(CC_B(_, CC_C(_, _), _))