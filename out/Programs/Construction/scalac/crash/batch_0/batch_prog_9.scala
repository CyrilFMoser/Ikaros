package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}