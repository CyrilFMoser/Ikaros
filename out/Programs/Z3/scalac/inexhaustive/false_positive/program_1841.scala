package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: (Char,Byte)) extends T_A[D]
case class CC_C[F]() extends T_B[F, T_B[F, Byte]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, ('x',_)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)