package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B]) extends T_A[B]
case class CC_B[C](a: Int, b: T_B) extends T_A[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
}
}
// This is not matched: CC_A(_)