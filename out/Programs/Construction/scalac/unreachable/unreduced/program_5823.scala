package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Byte]], b: Byte) extends T_A[Byte]
case class CC_B() extends T_A[Byte]
case class CC_C() extends T_A[Byte]
case class CC_D[B](a: T_A[B], b: CC_A, c: Byte) extends T_B

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()