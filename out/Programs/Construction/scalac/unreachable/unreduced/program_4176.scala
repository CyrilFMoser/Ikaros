package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_B[G, H]() extends T_A[G, H]
case class CC_C[I](a: I, b: T_A[I, I]) extends T_A[I, T_A[I, I]]
case class CC_D(a: T_B[T_A[Boolean, Byte], T_A[(Int,Byte), Byte]], b: CC_C[CC_C[Boolean]]) extends T_B[T_A[CC_B[Char, (Boolean,Boolean)], Int], T_A[T_A[(Char,Byte), Boolean], T_A[(Boolean,Boolean), Int]]]
case class CC_E(a: T_B[Int, CC_A[Byte, Char]], b: CC_B[(CC_D,CC_D), T_A[CC_D, CC_D]], c: T_A[CC_D, CC_B[CC_D, CC_D]]) extends T_B[T_A[CC_B[Char, (Boolean,Boolean)], Int], T_A[T_A[(Char,Byte), Boolean], T_A[(Boolean,Boolean), Int]]]
case class CC_F(a: Int) extends T_B[T_A[CC_B[Char, (Boolean,Boolean)], Int], T_A[T_A[(Char,Byte), Boolean], T_A[(Boolean,Boolean), Int]]]

val v_a: T_B[T_A[CC_B[Char, (Boolean,Boolean)], Int], T_A[T_A[(Char,Byte), Boolean], T_A[(Boolean,Boolean), Int]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_F(_) => 1 
}
}
// This is not matched: CC_E(_, _, _)