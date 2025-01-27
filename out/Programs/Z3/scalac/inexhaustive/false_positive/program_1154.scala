package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B(a: (Byte,Byte), b: T_A[Char, (Boolean,Char)]) extends T_A[T_B[Int, Int], Int]

val v_a: T_A[T_B[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_B((0,_), _) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_B)