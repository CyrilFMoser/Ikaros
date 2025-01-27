package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Int]]) extends T_A[T_A[Char]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[Char]]
case class CC_C(a: T_A[T_A[Char]]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_)) => 2 
  case CC_C(CC_C(CC_A(_, _))) => 3 
  case CC_C(CC_C(CC_B(_))) => 4 
  case CC_C(CC_C(CC_C(_))) => 5 
}
}
// This is not matched: CC_C(CC_A(_, _))