package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Int, Char], T_B[Boolean, Byte]]]
case class CC_B() extends T_A[T_B[T_B[Int, Char], T_B[Boolean, Byte]]]
case class CC_C[D]() extends T_B[CC_A, D]
case class CC_D[E](a: CC_A, b: CC_A, c: T_B[E, E]) extends T_B[CC_A, E]

val v_a: T_B[CC_A, Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(), CC_A(), _) => 1 
}
}