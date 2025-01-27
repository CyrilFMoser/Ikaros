package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[D, D], b: C) extends T_A[D, C]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}