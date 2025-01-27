package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: T_A[D, D], b: ((Byte,Byte),Byte)) extends T_A[T_A[D, D], D]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,0)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (Tuple Byte Char)))