package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte, b: T_B[D], c: Char) extends T_A[D, T_B[T_B[Byte]]]
case class CC_B[F, E](a: T_A[F, F], b: (T_B[Char],T_A[(Int,Int), Byte]), c: E) extends T_A[E, F]
case class CC_C[G]() extends T_A[G, (T_A[Char, Boolean],CC_B[Boolean, Byte])]
case class CC_D(a: T_A[Char, CC_C[Char]], b: CC_A[T_A[Boolean, Boolean]], c: (T_B[Int],CC_B[Boolean, Boolean])) extends T_B[T_A[T_B[Byte], Char]]

val v_a: T_A[Char, (T_A[Char, Boolean],CC_B[Boolean, Byte])] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, (_,_)), (_,CC_B(_, _, _)), _) => 0 
  case CC_B(CC_C(), (_,CC_B(_, _, _)), _) => 1 
  case CC_C() => 2 
}
}