package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Char]], c: Char) extends T_A[T_A[Char]]
case class CC_B(a: Int, b: (CC_A,T_A[Byte]), c: T_A[T_A[Int]]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _, _), _), _, _) => 0 
  case CC_A(CC_A(_, CC_B(_, _, _), _), _, _) => 1 
  case CC_A(CC_B(_, _, _), _, _) => 2 
  case CC_B(_, _, _) => 3 
}
}