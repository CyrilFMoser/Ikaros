package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[Char, (Boolean,Byte)], T_A[T_B, T_B]], b: T_A[T_A[T_B, T_B], T_A[T_B, T_B]], c: T_A[T_A[T_B, Boolean], T_A[(Int,Boolean), T_B]]) extends T_A[T_A[T_A[Boolean, T_B], Byte], T_A[T_A[T_B, T_B], T_B]]
case class CC_B(a: T_A[CC_A, CC_A], b: T_A[T_A[T_B, CC_A], Byte], c: CC_A) extends T_B
case class CC_C() extends T_B
case class CC_D(a: CC_A, b: CC_B, c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, _, _), CC_B(_, _, CC_A(_, _, _)), CC_C()) => 1 
}
}
// This is not matched: CC_B(_, _, _)