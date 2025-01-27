package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte) extends T_A[B]
case class CC_B[C](a: C) extends T_A[C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}