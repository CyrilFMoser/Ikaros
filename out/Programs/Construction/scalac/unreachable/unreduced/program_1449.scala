package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Int], T_A[Char, Byte]], b: Boolean, c: T_A[Byte, T_A[Int, Byte]]) extends T_A[T_A[T_A[Boolean, Char], Boolean], Int]
case class CC_B() extends T_A[T_A[T_A[Boolean, Char], Boolean], Int]
case class CC_C(a: CC_A) extends T_A[T_A[T_A[Boolean, Char], Boolean], Int]

val v_a: T_A[T_A[T_A[Boolean, Char], Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _, _)) => 2 
}
}