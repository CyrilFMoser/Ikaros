package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[G, H](a: T_B[T_A[Boolean, G], H], b: Char) extends T_A[H, G]
case class CC_C(a: T_A[T_A[Byte, (Int,Char)], T_A[Boolean, Int]], b: CC_B[T_A[(Int,Char), Byte], Int]) extends T_B[T_A[(Boolean,Char), T_B[Boolean, (Char,Char)]], T_A[CC_A[(Int,Byte), Boolean], T_A[Boolean, Int]]]
case class CC_D(a: CC_C, b: (CC_A[CC_C, CC_C],CC_B[CC_C, CC_C]), c: CC_B[Byte, T_B[CC_C, CC_C]]) extends T_B[T_A[(Boolean,Char), T_B[Boolean, (Char,Char)]], T_A[CC_A[(Int,Byte), Boolean], T_A[Boolean, Int]]]
case class CC_E[I](a: T_A[I, I]) extends T_B[T_A[(Boolean,Char), T_B[Boolean, (Char,Char)]], T_A[CC_A[(Int,Byte), Boolean], T_A[Boolean, Int]]]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}