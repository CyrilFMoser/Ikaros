package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Char, Int], b: T_A[Byte, T_B[Int, Boolean]], c: T_A[(Byte,Byte), T_B[Char, Int]]) extends T_A[T_A[T_B[Boolean, Int], T_A[Byte, Int]], T_B[(Byte,Byte), T_B[Boolean, Boolean]]]
case class CC_B[E]() extends T_A[T_A[CC_A, Boolean], CC_A]
case class CC_C[F](a: Boolean) extends T_B[(CC_B[CC_A],CC_A), F]
case class CC_D[G](a: G, b: T_A[Boolean, G]) extends T_B[(CC_B[CC_A],CC_A), G]
case class CC_E(a: CC_A) extends T_B[(CC_B[CC_A],CC_A), ((CC_A,Boolean),((Int,Int),CC_A))]

val v_a: T_B[(CC_B[CC_A],CC_A), ((CC_A,Boolean),((Int,Int),CC_A))] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_E(CC_A(_, _, _))