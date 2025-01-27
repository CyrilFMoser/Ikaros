package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,Byte), b: T_A[Int]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,0), _) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard T_A) T_A)