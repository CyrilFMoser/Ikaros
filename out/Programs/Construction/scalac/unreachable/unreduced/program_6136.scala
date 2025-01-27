package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Char) extends T_A[C, T_A[T_A[Char, (Byte,Int)], T_A[Char, Boolean]]]
case class CC_B(a: T_A[CC_A[Int], T_A[Char, Char]]) extends T_A[CC_A[CC_A[Boolean]], T_A[T_A[Char, (Byte,Int)], T_A[Char, Boolean]]]
case class CC_C[D]() extends T_A[D, T_A[T_A[Char, (Byte,Int)], T_A[Char, Boolean]]]

val v_a: T_A[Int, T_A[T_A[Char, (Byte,Int)], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}