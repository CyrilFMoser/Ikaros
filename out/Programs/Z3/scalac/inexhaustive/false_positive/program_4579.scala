package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_C (T_A (CC_A Byte Boolean Boolean Boolean Boolean)))