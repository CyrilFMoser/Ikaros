package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[T_A[Boolean, Boolean], T_A[(Char,Char), Boolean]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Boolean, Boolean], T_A[(Char,Char), Boolean]]]

val v_a: T_A[Byte, T_A[T_A[Boolean, Boolean], T_A[(Char,Char), Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}