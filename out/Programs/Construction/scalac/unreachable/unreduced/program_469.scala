package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, Boolean], b: T_A[T_A[Char, Boolean], T_A[Boolean, Int]]) extends T_A[T_A[(Boolean,(Byte,Int)), T_A[Char, Char]], T_A[T_A[Byte, Int], T_A[Boolean, Boolean]]]
case class CC_B(a: (CC_A,(CC_A,Int))) extends T_A[T_A[(Boolean,(Byte,Int)), T_A[Char, Char]], T_A[T_A[Byte, Int], T_A[Boolean, Boolean]]]

val v_a: T_A[T_A[(Boolean,(Byte,Int)), T_A[Char, Char]], T_A[T_A[Byte, Int], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,_)) => 1 
}
}