package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Int,Boolean)) extends T_A[C, T_A[Int, Boolean]]

val v_a: T_A[Byte, T_A[Int, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, (12,_)) => 0 
}
}
// This is not matched: (CC_A Int Byte (T_A Int Byte))