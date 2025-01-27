package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Int], T_A[Int, Int]], b: T_A[T_A[Boolean, Char], T_A[Byte, Boolean]]) extends T_A[T_A[T_A[Boolean, (Int,Boolean)], Char], T_A[T_A[Byte, Boolean], Char]]
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A[T_A[T_A[Boolean, (Int,Boolean)], Char], T_A[T_A[Byte, Boolean], Char]]
case class CC_C() extends T_A[T_A[T_A[Boolean, (Int,Boolean)], Char], T_A[T_A[Byte, Boolean], Char]]

val v_a: T_A[T_A[T_A[Boolean, (Int,Boolean)], Char], T_A[T_A[Byte, Boolean], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)) => 1 
  case CC_C() => 2 
}
}