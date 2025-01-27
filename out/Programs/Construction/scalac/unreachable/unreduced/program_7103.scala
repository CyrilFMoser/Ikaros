package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: ((Int,Boolean),T_B[Char, Int]), b: T_B[T_B[Int, Boolean], T_B[(Char,Char), Int]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C[D, E](a: D, b: T_A[D], c: E) extends T_B[D, E]
case class CC_D(a: (CC_C[CC_B, CC_A],((Char,Byte),Byte)), b: Int) extends T_B[T_A[CC_A], CC_A]
case class CC_E[F](a: F, b: CC_B, c: T_A[F]) extends T_B[T_A[CC_A], CC_A]

val v_a: T_B[T_A[CC_A], CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_, _)) => 0 
  case CC_D(_, _) => 1 
  case CC_E(_, CC_B(), _) => 2 
}
}