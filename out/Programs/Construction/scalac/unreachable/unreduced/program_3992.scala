package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_B], b: T_B, c: T_B) extends T_A[T_A[T_A[T_B, (Int,Char)], Int], T_B]
case class CC_B(a: T_B, b: T_B, c: Char) extends T_A[T_A[T_A[T_B, (Int,Char)], Int], T_B]
case class CC_C(a: CC_A, b: CC_A, c: Boolean) extends T_A[T_A[T_A[T_B, (Int,Char)], Int], T_B]

val v_a: T_A[T_A[T_A[T_B, (Int,Char)], Int], T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, CC_A(_, _, _), _)