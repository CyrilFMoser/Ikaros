package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_A[Int, (Boolean,Char)]], b: Int, c: T_B[Char]) extends T_A[T_A[T_B[Char], T_A[Byte, Char]], T_B[T_A[Byte, Byte]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_B[Char], T_A[Byte, Char]], T_B[T_A[Byte, Byte]]]
case class CC_C[D]() extends T_B[D]
case class CC_D[E](a: E, b: Int) extends T_B[E]
case class CC_E(a: Byte, b: CC_A, c: Byte) extends T_B[Char]

val v_a: T_A[T_A[T_B[Char], T_A[Byte, Char]], T_B[T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12, _) => 0 
  case CC_B(CC_A(CC_C(), _, CC_C())) => 1 
  case CC_B(CC_A(CC_C(), _, CC_D(_, _))) => 2 
  case CC_B(CC_A(CC_C(), _, CC_E(_, _, _))) => 3 
  case CC_B(CC_A(CC_D(_, _), _, CC_C())) => 4 
  case CC_B(CC_A(CC_D(_, _), _, CC_D(_, _))) => 5 
  case CC_B(CC_A(CC_D(_, _), _, CC_E(_, _, _))) => 6 
}
}
// This is not matched: CC_A(_, _, _)