package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], Int], b: T_B[T_B[T_A, T_A], T_A], c: Byte) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_A) extends T_B[C, Boolean]
case class CC_D[D](a: CC_B, b: Boolean, c: CC_C[D]) extends T_B[D, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}