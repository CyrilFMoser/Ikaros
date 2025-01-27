package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B[F](a: (Int,Char)) extends T_A[T_B[Int, Int], F]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((12,_)) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard (T_A (T_A Boolean)))