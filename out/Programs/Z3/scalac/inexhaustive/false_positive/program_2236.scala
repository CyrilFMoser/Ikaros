package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, Byte], b: (Boolean,Char)) extends T_A[(Boolean,(Byte,Byte)), Int]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, (_,'x')) => 0 
}
}
// This is not matched: (CC_C (T_A (T_A (Tuple Char Byte))))