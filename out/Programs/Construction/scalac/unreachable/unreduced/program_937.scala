package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, (T_B[(Boolean,Int)],T_A[Byte, Byte])]
case class CC_B[E](a: E, b: E, c: CC_A[E]) extends T_A[E, (T_B[(Boolean,Int)],T_A[Byte, Byte])]
case class CC_C[F]() extends T_A[F, (T_B[(Boolean,Int)],T_A[Byte, Byte])]
case class CC_D(a: Boolean, b: CC_A[(Char,Char)], c: T_B[CC_C[Int]]) extends T_B[CC_B[CC_C[Char]]]
case class CC_E[G](a: CC_C[G], b: CC_D, c: CC_C[G]) extends T_B[G]

val v_a: T_A[Byte, (T_B[(Boolean,Int)],T_A[Byte, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(0, _, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C() => 3 
}
}