package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Int, T_A[T_B, T_B]], b: T_B) extends T_A[T_A[T_B, T_B], T_A[T_B, Byte]]
case class CC_B(a: T_B) extends T_A[T_A[T_B, T_B], T_A[T_B, Byte]]
case class CC_C(a: CC_A, b: Boolean, c: T_A[T_A[T_B, T_B], T_A[T_B, Byte]]) extends T_A[T_A[T_B, T_B], T_A[T_B, Byte]]

val v_a: T_A[T_A[T_B, T_B], T_A[T_B, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(_, _), _, CC_A(_, _)) => 2 
  case CC_C(CC_A(_, _), _, CC_B(_)) => 3 
}
}
// This is not matched: CC_C(CC_A(_, _), _, CC_C(_, _, _))