package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: C) extends T_A[Boolean, C]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}