package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_B[Char, Int], T_A[Char, Char]]) extends T_A[T_A[T_B[Char, Byte], (Boolean,Int)], T_A[T_A[Int, Int], Int]]
case class CC_B[E](a: T_B[E, E]) extends T_A[T_A[T_B[Char, Byte], (Boolean,Int)], T_A[T_A[Int, Int], Int]]
case class CC_C(a: T_B[T_A[CC_A, CC_A], CC_A]) extends T_A[T_A[T_B[Char, Byte], (Boolean,Int)], T_A[T_A[Int, Int], Int]]

val v_a: T_A[T_A[T_B[Char, Byte], (Boolean,Int)], T_A[T_A[Int, Int], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_)