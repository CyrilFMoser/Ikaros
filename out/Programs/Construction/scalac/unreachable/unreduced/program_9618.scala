package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, Byte]
case class CC_B() extends T_A[CC_A[T_A[Boolean, Boolean]], Byte]

val v_a: T_A[CC_A[T_A[Boolean, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}