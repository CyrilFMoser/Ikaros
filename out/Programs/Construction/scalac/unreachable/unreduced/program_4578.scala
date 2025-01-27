package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_B) extends T_A[T_A[T_A[T_B, Int], T_B], C]
case class CC_B() extends T_B
case class CC_C(a: CC_A[Byte], b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _, _), CC_B()) => 1 
}
}