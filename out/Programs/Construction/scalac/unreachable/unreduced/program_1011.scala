package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[T_A[D, D], D]
case class CC_C() extends T_A[T_A[T_A[T_A[((Char,Boolean),T_B), ((Char,Boolean),T_B)], ((Char,Boolean),T_B)], T_A[T_A[((Char,Boolean),T_B), ((Char,Boolean),T_B)], ((Char,Boolean),T_B)]], T_A[T_A[((Char,Boolean),T_B), ((Char,Boolean),T_B)], ((Char,Boolean),T_B)]]
case class CC_D() extends T_B

val v_a: T_A[T_A[T_A[T_A[((Char,Boolean),T_B), ((Char,Boolean),T_B)], ((Char,Boolean),T_B)], T_A[T_A[((Char,Boolean),T_B), ((Char,Boolean),T_B)], ((Char,Boolean),T_B)]], T_A[T_A[((Char,Boolean),T_B), ((Char,Boolean),T_B)], ((Char,Boolean),T_B)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _)