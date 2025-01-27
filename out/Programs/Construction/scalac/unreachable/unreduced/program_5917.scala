package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D, E](a: E, b: (CC_A[Char],((Byte,Byte),Char))) extends T_A[D, T_A[D, D]]
case class CC_C[F](a: T_A[F, F], b: CC_A[F], c: Boolean) extends T_A[F, T_A[F, F]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_A(), _) => 2 
}
}