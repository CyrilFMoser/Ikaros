package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Char, b: T_A[Byte, T_A[Int, Byte]], c: T_A[T_A[Boolean, Char], T_A[(Byte,Char), Char]]) extends T_A[T_A[T_A[Boolean, Int], (Boolean,Byte)], T_A[T_A[Int, Boolean], Int]]
case class CC_B() extends T_A[T_A[T_A[Boolean, Int], (Boolean,Byte)], T_A[T_A[Int, Boolean], Int]]

val v_a: T_A[T_A[T_A[Boolean, Int], (Boolean,Byte)], T_A[T_A[Int, Boolean], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}