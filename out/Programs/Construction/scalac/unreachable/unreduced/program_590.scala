package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Int, b: T_B, c: T_A[T_A[T_B, T_B], T_A[T_B, Char]]) extends T_A[T_A[T_B, T_A[Boolean, T_B]], Char]
case class CC_B(a: T_A[T_A[T_B, Byte], T_B], b: CC_A, c: (T_A[CC_A, T_B],CC_A)) extends T_B
case class CC_C(a: CC_A, b: (Int,CC_B)) extends T_B
case class CC_D(a: T_B, b: T_A[T_B, Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_B(_, CC_A(_, _, _), (_,_))