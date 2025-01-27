package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: C, c: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: T_A[D, D], c: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_C() extends T_A[T_A[T_A[Byte, Boolean], T_A[Byte, Boolean]], T_A[Byte, Boolean]]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[Byte, Boolean]], T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, CC_A(_, _, _)) => 1 
  case CC_B(_, _, CC_B(_, _, _)) => 2 
  case CC_B(_, _, CC_C()) => 3 
  case CC_C() => 4 
}
}