package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: ((Byte,Boolean),Byte), b: T_A[(Int,Byte), C]) extends T_A[C, T_A[C, C]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A((_,0), _) => 0 
}
}
// This is not matched: (CC_A Boolean (T_A (Tuple Boolean Int)))