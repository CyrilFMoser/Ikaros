package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B() extends T_B
case class CC_C() extends T_B
case class CC_D[B](a: Byte, b: T_A[Byte], c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_C()