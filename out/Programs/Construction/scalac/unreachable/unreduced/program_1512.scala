package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[E, D]
case class CC_B[F, G]() extends T_A[G, F]
case class CC_C[I, H](a: (Char,T_A[(Boolean,Byte), Boolean])) extends T_A[I, H]
case class CC_D(a: T_B[T_A[Char, Byte]]) extends T_B[CC_C[CC_A[Int, Boolean], T_A[Byte, Boolean]]]
case class CC_E() extends T_B[CC_C[CC_A[Int, Boolean], T_A[Byte, Boolean]]]

val v_a: T_B[CC_C[CC_A[Int, Boolean], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E() => 1 
}
}