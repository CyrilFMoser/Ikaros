package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Boolean], Boolean], b: T_A[T_A[Byte, Int], T_A[Boolean, Int]], c: T_A[T_A[Int, Char], T_A[Int, Boolean]]) extends T_A[T_A[T_A[Int, Int], T_A[Char, (Int,Char)]], T_A[T_A[Char, Int], Int]]
case class CC_B() extends T_A[T_A[T_A[Int, Int], T_A[Char, (Int,Char)]], T_A[T_A[Char, Int], Int]]
case class CC_C(a: T_A[CC_A, T_A[CC_B, CC_A]]) extends T_A[T_A[T_A[Int, Int], T_A[Char, (Int,Char)]], T_A[T_A[Char, Int], Int]]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Char, (Int,Char)]], T_A[T_A[Char, Int], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}