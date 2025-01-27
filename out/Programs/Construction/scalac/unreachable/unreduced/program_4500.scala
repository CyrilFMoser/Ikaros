package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B(a: CC_A[T_B[Char, (Int,Char)], CC_A[Byte, Char]], b: T_B[CC_A[Byte, Int], Int]) extends T_A[CC_A[T_A[Char, Byte], Char], T_B[Boolean, (Byte,Int)]]
case class CC_C[G](a: G, b: T_A[CC_A[G, G], G]) extends T_B[G, CC_B]

val v_a: T_A[CC_A[T_A[Char, Byte], Char], T_B[Boolean, (Byte,Int)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}