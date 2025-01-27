package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[T_A[Int, Boolean], T_A[Char, (Int,Char)]]]
case class CC_B(a: Char, b: CC_A[CC_A[Byte]], c: T_A[Byte, CC_A[Char]]) extends T_A[CC_A[T_A[Boolean, Boolean]], T_A[T_A[Int, Boolean], T_A[Char, (Int,Char)]]]

val v_a: T_A[T_A[CC_A[T_A[Boolean, Boolean]], T_A[T_A[Int, Boolean], T_A[Char, (Int,Char)]]], T_A[T_A[Int, Boolean], T_A[Char, (Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, CC_A(_), _)) => 1 
}
}