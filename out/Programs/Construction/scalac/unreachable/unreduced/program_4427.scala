package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Boolean], Byte], b: T_A[T_A[Int, Byte], Int]) extends T_A[T_A[T_A[Char, Char], Char], Int]
case class CC_B(a: CC_A, b: T_A[(CC_A,CC_A), CC_A]) extends T_A[T_A[T_A[Char, Char], Char], Int]
case class CC_C() extends T_A[T_A[T_A[Char, Char], Char], Int]

val v_a: T_A[T_A[T_A[Char, Char], Char], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_C() => 2 
}
}