package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[T_B[Int, Byte], T_B[Char, Int]]]
case class CC_B[F](a: CC_A[Byte], b: T_A[F, F], c: T_A[F, T_A[Char, F]]) extends T_A[F, T_B[T_B[Int, Byte], T_B[Char, Int]]]
case class CC_C[G](a: G, b: G) extends T_B[G, T_A[CC_A[Char], CC_A[(Boolean,Byte)]]]
case class CC_D(a: CC_A[T_B[Int, Byte]], b: CC_A[CC_B[Int]], c: ((Int,Byte),CC_A[Int])) extends T_B[CC_A[CC_C[Byte]], T_A[CC_A[Char], CC_A[(Boolean,Byte)]]]

val v_a: T_A[Char, T_B[T_B[Int, Byte], T_B[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
}
}