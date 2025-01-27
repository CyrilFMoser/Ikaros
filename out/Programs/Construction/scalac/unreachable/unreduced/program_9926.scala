package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: (T_B[Byte, Byte],T_A[Byte, Int]), b: Byte) extends T_A[E, F]
case class CC_B[G](a: T_A[G, G]) extends T_A[G, T_A[T_A[Byte, Boolean], Byte]]
case class CC_C(a: CC_A[T_A[(Char,Char), Char], T_A[Int, Byte]]) extends T_A[CC_B[CC_B[Byte]], T_A[T_A[Byte, Boolean], Byte]]
case class CC_D(a: CC_C, b: CC_A[T_A[Byte, CC_C], T_A[CC_C, CC_C]], c: T_A[T_B[CC_C, CC_C], T_B[Int, CC_C]]) extends T_B[Byte, T_A[T_B[CC_C, CC_C], CC_B[Int]]]
case class CC_E(a: CC_A[Boolean, T_A[CC_D, CC_D]], b: T_A[(CC_C,CC_C), T_B[CC_C, Int]], c: Char) extends T_B[Byte, T_A[T_B[CC_C, CC_C], CC_B[Int]]]
case class CC_F() extends T_B[Byte, T_A[T_B[CC_C, CC_C], CC_B[Int]]]

val v_a: T_A[Int, T_A[T_A[Byte, Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_, _)), _) => 0 
  case CC_B(CC_A(_, _)) => 1 
}
}