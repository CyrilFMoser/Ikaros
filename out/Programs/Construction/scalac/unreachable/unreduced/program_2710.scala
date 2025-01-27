package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B, T_B], T_A[T_B, T_B]], b: (T_A[Boolean, Byte],T_A[T_B, T_B]), c: T_B) extends T_A[T_B, T_B]
case class CC_B() extends T_A[T_B, T_B]
case class CC_C(a: CC_B, b: (T_A[T_B, T_B],T_B), c: T_A[T_B, T_B]) extends T_B
case class CC_D(a: T_B, b: Byte) extends T_B
case class CC_E[C](a: Boolean, b: T_A[T_B, T_B], c: CC_A) extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C(_, _, _)) => 0 
  case CC_A(_, _, CC_D(_, _)) => 1 
  case CC_A(_, _, CC_E(_, _, _)) => 2 
  case CC_B() => 3 
}
}