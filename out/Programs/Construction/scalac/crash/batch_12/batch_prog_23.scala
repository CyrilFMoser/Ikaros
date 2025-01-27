package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: B) extends T_A[B]
case class CC_B[D]() extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}