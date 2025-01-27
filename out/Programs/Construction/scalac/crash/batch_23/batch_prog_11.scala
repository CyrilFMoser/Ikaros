package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: ((Int,Byte),Char), b: E) extends T_A[D, E]
case class CC_B[G, F](a: CC_A[G, T_A[G, G]], b: Char, c: T_B[F]) extends T_A[G, F]
case class CC_C(a: Int) extends T_A[(CC_B[Boolean, Char],T_A[Byte, Byte]), T_A[CC_A[Boolean, Char], Int]]
case class CC_D(a: CC_C, b: Boolean, c: T_A[CC_B[CC_C, CC_C], T_A[CC_C, CC_C]]) extends T_B[CC_B[CC_B[CC_C, CC_C], Boolean]]

val v_a: CC_B[Char, CC_C] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, _) => 0 
}
}