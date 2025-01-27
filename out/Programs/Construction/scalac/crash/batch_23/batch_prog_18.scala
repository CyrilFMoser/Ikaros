package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Char]) extends T_A
case class CC_B[B](a: T_B[B], b: T_A) extends T_B[B]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, CC_A(_)), CC_A(CC_B(_, _))) => 0 
}
}