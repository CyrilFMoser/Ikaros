package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[(T_B[Int, (Boolean,Int)],T_B[Boolean, Int])]
case class CC_B(a: T_A[Int], b: (T_B[(Boolean,Int), Byte],T_B[CC_A, CC_A]), c: CC_A) extends T_A[(T_B[Int, (Boolean,Int)],T_B[Boolean, Int])]
case class CC_C[D, E](a: CC_A, b: (((Char,Boolean),CC_A),(CC_A,CC_B)), c: T_B[E, D]) extends T_B[D, E]
case class CC_D[F](a: T_B[F, F], b: T_B[Byte, F], c: T_B[F, F]) extends T_B[Byte, F]
case class CC_E[G]() extends T_B[Byte, G]

val v_a: T_A[(T_B[Int, (Boolean,Int)],T_B[Boolean, Int])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (CC_C(_, _, _),CC_C(_, _, _)), _) => 1 
}
}