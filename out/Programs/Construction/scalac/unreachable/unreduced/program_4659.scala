package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Boolean, Int], T_A[Char, Byte]]]
case class CC_B(a: Int, b: T_A[Int, ((Boolean,Char),Int)], c: T_A[CC_A[Int], CC_A[Byte]]) extends T_A[T_A[CC_A[Int], T_A[Boolean, Boolean]], T_A[T_A[Boolean, Int], T_A[Char, Byte]]]
case class CC_C(a: T_A[Int, Boolean]) extends T_A[CC_B, T_A[T_A[Boolean, Int], T_A[Char, Byte]]]

val v_a: T_A[T_A[CC_A[Int], T_A[Boolean, Boolean]], T_A[T_A[Boolean, Int], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}