package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[F](a: ((Byte,Boolean),Int)) extends T_A[T_A[F, F], F]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((_,12)) => 0 
}
}
// This is not matched: Pattern match is empty without constants