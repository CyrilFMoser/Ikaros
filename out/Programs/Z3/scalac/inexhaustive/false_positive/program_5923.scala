package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[F](a: (Char,Char)) extends T_A[T_A[Char, Boolean], F]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(('x',_)) => 0 
}
}
// This is not matched: (CC_F Wildcard (CC_D Boolean Wildcard T_B) T_B)