package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Byte,Byte), b: T_A[Int, Char]) extends T_A[T_A[Int, (Int,Boolean)], T_A[Char, Char]]

val v_a: T_A[T_A[Int, (Int,Boolean)], T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,0), _) => 0 
}
}
// This is not matched: (CC_B Int (CC_B Int Wildcard (T_A Int)) (T_A Int))