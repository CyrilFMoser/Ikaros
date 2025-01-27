package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Int, b: T_A[(Boolean,Boolean), T_A[Boolean, Boolean]], c: (T_A[Byte, Char],Char)) extends T_A[T_A[T_B[Char], T_A[Byte, Int]], Char]
case class CC_B() extends T_A[T_A[T_B[Char], T_A[Byte, Int]], Char]
case class CC_C(a: Boolean, b: CC_A) extends T_A[T_A[T_B[Char], T_A[Byte, Int]], Char]
case class CC_D(a: T_A[Byte, T_B[Boolean]]) extends T_B[CC_B]

val v_a: T_A[T_A[T_B[Char], T_A[Byte, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, CC_A(_, _, (_,_)))