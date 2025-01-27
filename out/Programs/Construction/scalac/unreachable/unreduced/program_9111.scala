package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Char],((Boolean,Int),Boolean)), b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[T_A[Boolean, Int], T_A[Int, Char]]]
case class CC_B() extends T_A[Byte, T_A[T_A[Boolean, Int], T_A[Int, Char]]]
case class CC_C() extends T_A[Byte, T_A[T_A[Boolean, Int], T_A[Int, Char]]]

val v_a: T_A[Byte, T_A[T_A[Boolean, Int], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_)), _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}