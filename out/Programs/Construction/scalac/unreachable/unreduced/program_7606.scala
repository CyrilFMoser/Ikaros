package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: (T_A[(Byte,Char), Boolean],T_A[Char, Char])) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Boolean]], C]
case class CC_B[D](a: D, b: CC_A[D]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Boolean]], D]
case class CC_C() extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Boolean]], Boolean]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}