package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B(a: Int) extends T_A[T_A[Char, Byte], (Char,Char)]
case class CC_C[F](a: T_A[F, F], b: ((Char,Int),CC_B)) extends T_A[T_B, F]

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, (_,CC_B(12))) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)