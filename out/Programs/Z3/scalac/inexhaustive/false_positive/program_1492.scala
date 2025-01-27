package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_C[F](a: (Byte,Int)) extends T_A[F, T_A[Int, F]]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C((0,_)) => 0 
}
}
// This is not matched: (CC_C (T_A (T_A Byte)))