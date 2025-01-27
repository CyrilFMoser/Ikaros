package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean, b: Byte) extends T_A[E, Int]
case class CC_B[G, F](a: G) extends T_A[G, F]
case class CC_C(a: Int, b: T_B[T_A[Byte, Int], T_B[(Char,Int), Byte]], c: Boolean) extends T_B[Byte, T_A[CC_B[Char, (Boolean,Int)], T_A[Byte, Int]]]
case class CC_D(a: Int) extends T_B[Byte, T_A[CC_B[Char, (Boolean,Int)], T_A[Byte, Int]]]

val v_a: T_B[Byte, T_A[CC_B[Char, (Boolean,Int)], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_C(12, _, _) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_C(_, _, _)