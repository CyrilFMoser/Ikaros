package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[(Char,Byte)], T_B[(Int,Boolean), Boolean]]) extends T_A[T_B[T_B[Char, (Byte,Byte)], T_B[Byte, Int]]]
case class CC_B(a: Boolean) extends T_A[T_B[T_B[Char, (Byte,Byte)], T_B[Byte, Int]]]
case class CC_C[D](a: (T_B[Int, CC_A],T_B[CC_A, Byte]), b: D, c: T_A[D]) extends T_B[D, Byte]
case class CC_D[E, F]() extends T_B[E, F]
case class CC_E[G]() extends T_B[G, Byte]

val v_a: T_B[CC_A, Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_), _) => 0 
  case CC_D() => 1 
  case CC_E() => 2 
}
}