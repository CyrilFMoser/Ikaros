package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Int,Int)) extends T_A[T_A[Boolean, Int], T_A[Boolean, Byte]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
}
}
// This is not matched: (CC_B Char Char (CC_A Char Wildcard Wildcard (T_A Int Char)) (T_A Int Char))