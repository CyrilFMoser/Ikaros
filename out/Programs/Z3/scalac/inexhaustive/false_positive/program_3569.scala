package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_C[F](a: (Byte,Char)) extends T_A[CC_A[(Byte,Int), Char], F]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C((0,_)) => 0 
}
}
// This is not matched: (CC_E T_B)