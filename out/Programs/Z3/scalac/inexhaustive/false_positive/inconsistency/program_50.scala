package Program_31 

object Test {
sealed trait T_A[B]
case class CC_A[C](a: T_A[(Boolean,Byte)], b: (Boolean,(Byte,Char))) extends T_A[T_A[C]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,(_,'x'))) => 0 
}
}
// This is not matched: (CC_C (T_A (T_B Int (Tuple Byte Byte)))
//      Int
//      (T_B (T_A (T_B Int (Tuple Byte Byte))) Int))