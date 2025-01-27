package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Int,Char), Char], b: (Byte,Byte)) extends T_A[T_A[Char, Int], T_A[Byte, Boolean]]

val v_a: T_A[T_A[Char, Int], T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,0)) => 0 
}
}
// This is not matched: (CC_B (T_A (Tuple Int Char)))