package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B() extends T_A[T_A[Byte, T_A[(Char,Boolean), Boolean]], T_A[T_A[T_A[Byte, T_A[(Char,Boolean), Boolean]], T_A[Byte, T_A[(Char,Boolean), Boolean]]], T_A[Byte, T_A[(Char,Boolean), Boolean]]]]
case class CC_C[D](a: Byte) extends T_A[T_A[Byte, T_A[(Char,Boolean), Boolean]], T_A[T_A[T_A[Byte, T_A[(Char,Boolean), Boolean]], T_A[Byte, T_A[(Char,Boolean), Boolean]]], T_A[Byte, T_A[(Char,Boolean), Boolean]]]]

val v_a: T_A[T_A[Byte, T_A[(Char,Boolean), Boolean]], T_A[T_A[T_A[Byte, T_A[(Char,Boolean), Boolean]], T_A[Byte, T_A[(Char,Boolean), Boolean]]], T_A[Byte, T_A[(Char,Boolean), Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}