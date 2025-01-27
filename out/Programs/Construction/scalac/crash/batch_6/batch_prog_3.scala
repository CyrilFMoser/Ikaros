package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: T_B, c: (T_B,T_A[T_B])) extends T_A[B]
case class CC_B() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}