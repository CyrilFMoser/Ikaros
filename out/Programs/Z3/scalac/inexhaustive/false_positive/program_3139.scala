package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Int,Byte), b: T_A[(Char,Boolean), Int]) extends T_A[T_A[(Boolean,Int), Int], (Boolean,Int)]

val v_a: T_A[T_A[(Boolean,Int), Int], (Boolean,Int)] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: (CC_B Char Wildcard Wildcard (T_A Char))