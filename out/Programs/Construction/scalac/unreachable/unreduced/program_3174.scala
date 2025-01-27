package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean, b: E) extends T_A[E, T_A[E, (Byte,Boolean)]]
case class CC_B[F]() extends T_A[F, T_B[Byte, CC_A[Byte]]]
case class CC_C() extends T_B[Int, T_B[CC_B[Int], T_A[Char, Char]]]
case class CC_D(a: T_A[CC_B[CC_C], T_B[CC_C, CC_C]], b: CC_C, c: Boolean) extends T_B[Int, T_B[CC_B[Int], T_A[Char, Char]]]
case class CC_E(a: CC_B[CC_C], b: Byte, c: CC_C) extends T_B[Int, T_B[CC_B[Int], T_A[Char, Char]]]

val v_a: T_B[Int, T_B[CC_B[Int], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_C(), _) => 1 
  case CC_E(_, _, _) => 2 
}
}