package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, D]) extends T_A[D, Char]
case class CC_B(a: CC_A[(Int,Byte)], b: T_A[T_A[Byte, Char], T_A[Byte, Char]], c: T_A[CC_A[Int], Int]) extends T_A[T_B[T_A[Boolean, Boolean]], Char]
case class CC_C() extends T_A[T_B[T_A[Boolean, Boolean]], Char]

val v_a: T_A[T_B[T_A[Boolean, Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _)