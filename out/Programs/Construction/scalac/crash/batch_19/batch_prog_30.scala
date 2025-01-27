package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: (Int,T_A[Int]), c: Boolean) extends T_A[B]
case class CC_B[C](a: C) extends T_A[C]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}