package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Int,Int), b: T_A[Byte, Int]) extends T_A[(Int,Byte), Boolean]

val v_a: T_A[(Int,Byte), Boolean] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: (CC_B Boolean (T_A Boolean))