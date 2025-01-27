package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Boolean], Byte]) extends T_A[T_A[T_A[Boolean, Byte], Int], Char]
case class CC_B() extends T_A[T_A[T_A[Boolean, Byte], Int], Char]

val v_a: T_A[T_A[T_A[Boolean, Byte], Int], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}