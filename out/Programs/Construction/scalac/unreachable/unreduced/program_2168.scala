package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Char], Boolean], b: T_A[T_A[Int, Char], T_A[Char, Int]]) extends T_A[T_A[T_A[Char, Boolean], Int], T_A[T_A[Boolean, Int], T_A[Char, (Int,Byte)]]]
case class CC_B(a: T_A[CC_A, (CC_A,CC_A)], b: CC_A, c: Boolean) extends T_A[T_A[T_A[Char, Boolean], Int], T_A[T_A[Boolean, Int], T_A[Char, (Int,Byte)]]]
case class CC_C(a: CC_A, b: CC_B, c: CC_A) extends T_A[T_A[T_A[Char, Boolean], Int], T_A[T_A[Boolean, Int], T_A[Char, (Int,Byte)]]]

val v_a: T_A[T_A[T_A[Char, Boolean], Int], T_A[T_A[Boolean, Int], T_A[Char, (Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _), _) => 1 
  case CC_C(_, _, _) => 2 
}
}