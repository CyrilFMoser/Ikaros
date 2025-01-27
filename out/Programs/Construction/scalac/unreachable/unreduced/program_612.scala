package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: Boolean, b: ((CC_A,CC_A),T_A[Boolean]), c: T_A[Byte]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(true, _, _) => 1 
  case CC_B(false, _, _) => 2 
}
}