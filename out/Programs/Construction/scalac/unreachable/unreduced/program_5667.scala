package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Char], T_A[Int, Int]]) extends T_A[T_A[T_A[Int, Int], T_A[Int, Char]], Byte]
case class CC_B() extends T_A[T_A[T_A[Int, Int], T_A[Int, Char]], Byte]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Int, Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}