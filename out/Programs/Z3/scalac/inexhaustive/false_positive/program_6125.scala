package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Int,Int), b: T_A[Int]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: (CC_A Char Wildcard (T_A Char (T_A Char Char)))