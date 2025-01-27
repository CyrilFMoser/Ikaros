package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_B[D], D], b: T_A[D, D]) extends T_A[D, T_B[D]]
case class CC_B[E](a: Boolean) extends T_A[T_B[E], E]
case class CC_C() extends T_A[T_A[CC_A[Byte], T_A[Boolean, Boolean]], T_B[T_A[CC_A[Byte], T_A[Boolean, Boolean]]]]

val v_a: T_A[T_A[CC_A[Byte], T_A[Boolean, Boolean]], T_B[T_A[CC_A[Byte], T_A[Boolean, Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(true), _) => 0 
  case CC_A(CC_B(false), _) => 1 
  case CC_C() => 2 
}
}