package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_A) extends T_A

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}